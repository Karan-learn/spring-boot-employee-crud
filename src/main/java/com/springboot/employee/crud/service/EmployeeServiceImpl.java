package com.springboot.employee.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.employee.crud.model.Employee;
import com.springboot.employee.crud.repository.EmployeeRepository;
@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Long employeeId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteEmployee(Employee employee) {
		employeeRepository.delete(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Optional<Employee> findById(Long employeeId) {
		return employeeRepository.findById(employeeId);
	}

}
