package com.ivan.testProject.repository;

import com.ivan.testProject.model.EmployeeCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeCategoryRepository extends JpaRepository<EmployeeCategory, Long> {
}
