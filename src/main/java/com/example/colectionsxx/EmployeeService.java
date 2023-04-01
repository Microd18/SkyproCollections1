package com.example.colectionsxx;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    private final List<Employee> employee = new ArrayList<>();

    public Employee addEmployee2(String name, String lastName) {

        Employee people1 = new Employee(name, lastName);

        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            if (value.equals(people1)) {
                throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть в списке");
            }
        }

        employee.add(people1);

        return people1;
    }

    public Employee removeEmployee(String name, String lastName) {

        Employee people1 = new Employee(name, lastName);

        for (int i = 0; i < employee.size(); i++) {
            if (employee.get(i) == null) {
                continue;
            }
            if (employee.get(i).equals(people1)) {
                employee.remove(i);
                return people1;
            }
        }

        throw new EmployeeNotFoundException("Сотрудник не найден.");
    }

    public Employee findEmployee(String name, String lastName) {

        Employee people1 = new Employee(name, lastName);

        for (Employee e : employee) {
            if (e == null) {
                continue;
            }
            if (e.equals(people1)) {
                return e;
            }
        }

        throw new EmployeeNotFoundException("Сотрудник не найден.");
    }

    public List<Employee> showAll() {
        return employee;
    }
}

// Этот метод был для массива, если мы заменили массив на ArrayList,
// то как в нем не может быть места, если он динамически расширяется?
// оставил этот метод чтобы EmployeeStorageIsFullException не пропадал

/*    public Employee addEmployee(String name, String lastName) {

        Employee people1 = new Employee(name, lastName);

        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            if (value.equals(people1)) {
                throw new EmployeeAlreadyAddedException("Такой сотрудник уже есть в списке");
            }
        }

        for (int i = 0; i < employee.size(); i++) {
            if (employee.[i] == null) {
                employee[i] = people1;
                break;
            }
            if (i == employee.size() - 1) {
                throw new EmployeeStorageIsFullException("Нет места для нового сотрудника");
            }
        }

        return people1;
    }*/
