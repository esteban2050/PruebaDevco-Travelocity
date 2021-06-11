package com.travelocity.exceptions;

public class ResultException extends AssertionError{
    public static final String TEXT_IS_INCORRECT = "the login button text remains the same";

    public ResultException(String message, Throwable cause){
        super(message,cause);
    }
}
