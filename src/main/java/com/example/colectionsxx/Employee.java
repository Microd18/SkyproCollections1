package com.example.colectionsxx;

import java.util.Objects;

public class Employee {

    private final String name;
    private final String lastName;
    private final int numberOfDepartment;

    public Employee(String name, String lastName, int numberOfDepartment) {
        this.name = name;
        this.lastName = lastName;
        this.numberOfDepartment = numberOfDepartment;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public int getNumberOfDepartment() {
        return numberOfDepartment;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        Employee employee = (Employee) obj;
        return (Objects.equals(name, employee.name)
                || (name != null && name.equals(employee.getName())))
                && (Objects.equals(lastName, employee.lastName)
                || (lastName != null && lastName.equals(employee.getLastName())));
    }

}
