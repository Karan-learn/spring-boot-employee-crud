package com.springboot.employee.crud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.springboot.employee.crud.model.Employee;

@Repository
//public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	public interface EmployeeRepository extends CrudRepository<Employee, Long>{

}
