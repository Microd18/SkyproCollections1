package com.example.colectionsxx;

public class EmployeeAlreadyAddedException extends RuntimeException {

    EmployeeAlreadyAddedException(String message) {
        super(message);
    }
}
