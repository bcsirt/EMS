package fr.bcsirt.employeemanagementsystem.service;

import fr.bcsirt.employeemanagementsystem.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;


public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(Long id);
}
