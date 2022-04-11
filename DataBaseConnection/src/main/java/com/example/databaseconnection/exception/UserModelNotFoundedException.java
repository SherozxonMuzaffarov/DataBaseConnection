package com.example.databaseconnection.exception;

public class UserModelNotFoundedException extends Exception{
    public UserModelNotFoundedException() {
        super();
    }

    public UserModelNotFoundedException(String message) {
        super(message);
    }

    public UserModelNotFoundedException(String message, Throwable cause) {
        super(message, cause);
    }

    public UserModelNotFoundedException(Throwable cause) {
        super(cause);
    }

    protected UserModelNotFoundedException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
