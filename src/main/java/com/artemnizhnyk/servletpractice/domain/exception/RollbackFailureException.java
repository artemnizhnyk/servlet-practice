package com.artemnizhnyk.servletpractice.domain.exception;

public class RollbackFailureException extends Exception {

    public RollbackFailureException(String message, Throwable cause) {
        super(message, cause);
    }

    public RollbackFailureException(String message) {
        super(message);
    }
}