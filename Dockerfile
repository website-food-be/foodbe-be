FROM gradle:jdk17-alpine AS build
# copy source to image
WORKDIR /app
COPY . /app
ENV GRADLE_OPTS="-Dorg.gradle.daemon=false"
ENV SPRING_PROFILES_ACTIVE="docker"
# build jar by gradle
RUN gradle build -x test


# Run stage
FROM openjdk:17-jdk-bullseye
WORKDIR /app
COPY --from=build /app/build/libs/foodbe-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 80

CMD ["java","-jar","app.jar"]


