package com.ivan.testProject.repository;

import com.ivan.testProject.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
