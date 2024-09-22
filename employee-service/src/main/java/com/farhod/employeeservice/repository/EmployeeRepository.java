package com.farhod.employeeservice.repository;

import com.farhod.employeeservice.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
