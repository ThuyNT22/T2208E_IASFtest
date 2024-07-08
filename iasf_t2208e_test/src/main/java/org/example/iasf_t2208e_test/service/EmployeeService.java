package org.example.iasf_t2208e_test.service;

import org.example.iasf_t2208e_test.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee createEmployee(Employee employee);
    List<Employee> findAllEmployees();
}
