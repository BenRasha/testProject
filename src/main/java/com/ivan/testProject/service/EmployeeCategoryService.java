package com.ivan.testProject.service;

import com.ivan.testProject.model.EmployeeCategory;
import com.ivan.testProject.repository.EmployeeCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeCategoryService {

    @Autowired
    EmployeeCategoryRepository employeeCategoryRepository;

    public List<EmployeeCategory> getAllEmployeesCategories() {
        List<EmployeeCategory> employeeCategories = new ArrayList<>();
        employeeCategoryRepository.findAll().forEach(employeeCategories::add);
        return employeeCategories;
    }

    public EmployeeCategory getEmployeeCategoryById(Long id) {
        return employeeCategoryRepository.findById(id).get();
    }

    public void saveOrUpdateEmployee(EmployeeCategory employeeCategory) {
        employeeCategoryRepository.save(employeeCategory);
    }

    public void delete(Long id) {
        employeeCategoryRepository.deleteById(id);
    }

}
