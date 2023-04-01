package com.example.colectionsxx;

public class EmployeeNotFoundException extends RuntimeException {

    EmployeeNotFoundException(String message) {
        super(message);
    }
}
