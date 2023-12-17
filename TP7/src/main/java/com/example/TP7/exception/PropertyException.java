package com.example.TP7.exception;

public class PropertyException extends RuntimeException{
    public PropertyException(Long id) {
        super("Property with ID " + id + " not found.");
    }
}