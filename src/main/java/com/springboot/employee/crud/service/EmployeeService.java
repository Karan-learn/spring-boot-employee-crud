package com.springboot.employee.crud.service;

import java.util.List;
import java.util.Optional;

import com.springboot.employee.crud.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Long employeeId);
	public void deleteEmployee(Employee employee);
	public List<Employee> getAllEmployees();
	public Optional<Employee> findById(Long employeeId);
}
