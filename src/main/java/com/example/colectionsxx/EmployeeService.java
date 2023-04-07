package com.example.colectionsxx;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class EmployeeService {
    private final Map<String, Employee> employee2 = new HashMap<>();

    public Employee addEmployee2(String name, String lastName) {

        Employee people1 = new Employee(name, lastName);

        if (employee2.containsKey(people1.getFullName())) {
            throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть в списке");
        }

        employee2.put(people1.getFullName(), people1);

        return people1;
    }

    public Employee removeEmployee(String name, String lastName) {

        Employee people1 = new Employee(name, lastName);
        if (!employee2.containsKey(people1.getFullName())) {
            throw new EmployeeNotFoundException("Сотрудник не найден.");
        }

        return employee2.remove(people1.getFullName());
    }

    public Employee findEmployee(String name, String lastName) {

        Employee people1 = new Employee(name, lastName);

        if (!employee2.containsKey(name + " " + lastName)) {
            throw new EmployeeNotFoundException("Сотрудник не найден.");
        }

        return people1;
    }

    public Map<String, Employee> showAll() {
        return employee2;
    }
}

