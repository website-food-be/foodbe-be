package com.example.be.messages;

public enum ErrorCode {
    INVALID_USERNAME_OR_PASSWORD_CODE("ERR_01"),
    NOT_FOUND_CODE("ERR_02");

    private final String code;

    ErrorCode(String code) {
        this.code = code;
    }
    public String getCode() {
        return code;
    }
}
