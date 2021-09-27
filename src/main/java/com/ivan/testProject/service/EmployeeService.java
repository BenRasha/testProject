package com.ivan.testProject.service;

import com.ivan.testProject.model.Employee;
import com.ivan.testProject.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    public List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employees::add);
        return employees;
    }

    @Cacheable(value = "idCache", key = "#id")

    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).get();
    }

    public void saveOrUpdateEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    public void delete(Long id) {
        employeeRepository.deleteById(id);
    }
}
