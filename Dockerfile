FROM gradle:jdk17-alpine AS build
# copy source to image
WORKDIR /app
COPY . .
# Override the application.yml inside container
COPY ./src/main/resources/application-docker.yml ./src/main/resources/application.yml

ENV GRADLE_OPTS="-Dorg.gradle.daemon=false"
# build jar by gradle
RUN gradle build -x test


# Run stage
FROM openjdk:17-jdk-bullseye
WORKDIR /app
COPY --from=build /app/build/libs/foodbe-0.0.1-SNAPSHOT.jar app.jar

CMD ["java","-jar","app.jar"]
EXPOSE 80


