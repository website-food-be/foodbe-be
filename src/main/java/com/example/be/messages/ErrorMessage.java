package com.example.be.messages;

public enum ErrorMessage {
    INVALID_USERNAME_OR_PASSWORD_MESSAGE("Username or password is invalid"),
    NOT_FOUND_IN("Cannot found");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    String getMessage() {
        return message;
    }
}
