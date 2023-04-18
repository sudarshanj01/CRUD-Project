package com.example.mvc.Demo.service;
import com.example.mvc.Demo.entity.Employee;
import java.util.List;

public interface EmployeeService {

    List<Employee> getAllEmployees();

    Employee saveEmployee(Employee employee);

    Employee getEmployeeById(long id);

    void deleteEmployeeById(long id);

    //for rest controller
    boolean deleteEmployee(Long id);

    Employee updateEmployee(Long id, Employee employee);
}
