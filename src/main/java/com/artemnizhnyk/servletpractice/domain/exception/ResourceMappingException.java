package com.artemnizhnyk.servletpractice.domain.exception;

public class ResourceMappingException extends RuntimeException {
    public ResourceMappingException(final String message) {
        super(message);
    }
}
