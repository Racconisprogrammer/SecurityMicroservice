package com.farhod.departmentservice.repository;

import com.farhod.departmentservice.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
