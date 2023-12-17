package com.example.TP7.exception;

public class OwnerException extends RuntimeException{
    public OwnerException(Long id) {
        super("Owner with ID " + id + " not found.");
    }
}