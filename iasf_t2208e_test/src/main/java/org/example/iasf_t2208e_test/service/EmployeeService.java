package org.example.iasf_t2208e_test.service;

import org.example.iasf_t2208e_test.dto.EmployeeDTO;
import java.util.List;

public interface EmployeeService {
    EmployeeDTO createEmployee(EmployeeDTO employeeDTO);
    List<EmployeeDTO> findAllEmployees();
}
