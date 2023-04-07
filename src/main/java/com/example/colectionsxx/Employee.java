package com.example.colectionsxx;

import java.util.Objects;

public class Employee {

    private final String name;
    private final String lastName;

    public Employee(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFullName() {
        return name + " " + lastName;
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
