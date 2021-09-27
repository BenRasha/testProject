package com.ivan.testProject.controller;

import com.ivan.testProject.model.EmployeeCategory;
import com.ivan.testProject.service.EmployeeCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeCategoryController {

    @Autowired
    EmployeeCategoryService employeeCategoryService;

    @GetMapping("/category")
    private List<EmployeeCategory> getAllEmployeesCategories() {
        return employeeCategoryService.getAllEmployeesCategories();
    }

    @GetMapping("/category/{id}")
    private EmployeeCategory getEmployeeCategory(@PathVariable("id") Long id) {
        return employeeCategoryService.getEmployeeCategoryById(id);
    }

    @DeleteMapping("/category/{id}")
    private void deleteCategoryEmployee(@PathVariable("id") Long id) {
        employeeCategoryService.delete(id);
    }

    @PostMapping("/category")
    private Long saveEmployee(@RequestBody EmployeeCategory employeeCategory) {
        employeeCategoryService.saveOrUpdateEmployee(employeeCategory);
        return employeeCategory.getId();
    }

}
