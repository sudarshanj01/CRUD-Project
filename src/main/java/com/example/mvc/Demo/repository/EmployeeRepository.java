package com.example.mvc.Demo.repository;

import com.example.mvc.Demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
