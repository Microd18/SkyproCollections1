package com.example.colectionsxx;

public class EmployeeStorageIsFullException extends RuntimeException {

    EmployeeStorageIsFullException(String message) {
        super(message);
    }
}
