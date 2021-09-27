package com.ivan.testProject.controller;

import com.ivan.testProject.model.Employee;
import com.ivan.testProject.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE)
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employee")
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping(value = "/employee/{id}")
    public Employee getEmployee(@PathVariable("id") Long id) {
        return employeeService.getEmployeeById(id);
    }

    @DeleteMapping("/employee/{id}")
    public void deleteEmployee(@PathVariable("id") Long id) {
        employeeService.delete(id);
    }

    @PostMapping("/employee")
    private Long saveEmployee(@RequestBody Employee employee) {
        employeeService.saveOrUpdateEmployee(employee);
        return employee.getId();
    }
}
