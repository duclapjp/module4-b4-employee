package com.codegym.service;

import com.codegym.model.Employee;

import java.util.List;

public interface IEmployeeService {
    List<Employee> findAll();

    void save(Employee customer);

    Employee findById(int id);

    void update(int id, Employee customer);

    void remote(int id);
    Employee findByName(String name);
}
