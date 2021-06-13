package com.travelocity.exceptions;

public class ResultException extends AssertionError{
    public static final String TEXT_IS_INCORRECT = "the login button text remains the same";
    public static final String LANGUAGE_IS_SAME = "the language did not change";
    public static final String TITLE_INCORRECT = "the title is incorrect";


    public ResultException(String message, Throwable cause){
        super(message,cause);
    }
}
