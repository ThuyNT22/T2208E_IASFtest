package org.example.iasf_t2208e_test.service.impl;

import org.example.iasf_t2208e_test.entity.Employee;
import org.example.iasf_t2208e_test.dto.EmployeeDTO;
import org.example.iasf_t2208e_test.repository.EmployeeRepository;
import org.example.iasf_t2208e_test.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee employee = new Employee(employeeDTO.getName(), employeeDTO.getWage());
        employee = employeeRepository.save(employee);
        return new EmployeeDTO(employee.getId(), employee.getName(), employee.getWage());
    }

    @Override
    public List<EmployeeDTO> findAllEmployees() {
        return employeeRepository.findAll().stream()
                .map(emp -> new EmployeeDTO(emp.getId(), emp.getName(), emp.getWage()))
                .collect(Collectors.toList());
    }
}
