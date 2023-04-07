package com.example.colectionsxx;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    private Map<String, Integer> employee2 = new HashMap<>();

    public Employee addEmployee2(String name, String lastName, int numberOfDepartment) {

        Employee people1 = new Employee(name, lastName, numberOfDepartment);

        if (employee2.containsKey(name + " " + lastName)) {
            throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть в списке");
        }

        employee2.put(name + " " + lastName, numberOfDepartment);

        return people1;
    }

    public Employee removeEmployee(String name, String lastName, int numberOfDepartment) {

        Employee people1 = new Employee(name, lastName, numberOfDepartment);
        if (!employee2.containsKey(name + " " + lastName)) {
            throw new EmployeeNotFoundException("Сотрудник не найден.");
        }

        employee2.remove(name + " " + lastName);

        return people1;
    }

    public Employee findEmployee(String name, String lastName, int numberOfDepartment) {

        Employee people1 = new Employee(name, lastName, numberOfDepartment);

        if (!employee2.containsKey(name + " " + lastName)) {
            throw new EmployeeNotFoundException("Сотрудник не найден.");
        }

        return people1;
    }

    public Map<String, Integer> showAll() {
        return employee2;
    }
}

