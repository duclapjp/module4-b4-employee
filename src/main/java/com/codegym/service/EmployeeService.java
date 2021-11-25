package com.codegym.service;

import com.codegym.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService implements IEmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee("1", "thái", "0123456789"));
        employeeList.add(new Employee("2", "an", "08888888"));
        employeeList.add(new Employee("3", "xuân anh", "09999999"));
        employeeList.add(new Employee("4", "ý", "07777777"));
    }

    @Override
    public List<Employee> findAll() {
        return employeeList;
    }

    @Override
    public void save(Employee employee) {
        employeeList.add(employee);
    }

    @Override
    public Employee findById(int id) {
        return null;
    }

    @Override
    public void update(int id, Employee employee) {
        employeeList.set(id, employee);
    }

    @Override
    public void remote(int id) {
        employeeList.remove(id);
    }

    @Override
    public Employee findByName(String name) {
        for (Employee e : employeeList) {
            if (e.getName().equals(name)) {
                return e;
            }
        }
        return null;
    }
}
