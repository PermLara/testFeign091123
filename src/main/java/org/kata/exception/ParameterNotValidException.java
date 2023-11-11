package org.kata.exception;

public class ParameterNotValidException extends RuntimeException {
    public ParameterNotValidException(String message) {
        super(message);
    }
}
