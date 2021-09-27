package com.ivan.testProject.repository;

import com.ivan.testProject.model.EmployeeCategory;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeCategoryRepository extends CrudRepository<EmployeeCategory, Long> {
}
