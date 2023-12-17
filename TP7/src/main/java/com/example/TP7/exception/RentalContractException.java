package com.example.TP7.exception;


public class RentalContractException extends RuntimeException{
    public RentalContractException(Long id) {
        super("RentalContract with ID " + id + " not found.");
    }
}