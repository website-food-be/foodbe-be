package com.example.be.exceptions;

import com.example.be.messages.ErrorCode;
import com.example.be.messages.ErrorMessage;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public abstract class FoodBeException extends Exception {
    protected ErrorCode errorCode;
    protected ErrorMessage errorMessage;
    protected HttpStatus httpCode;
}
