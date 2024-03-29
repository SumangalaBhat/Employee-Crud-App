package com.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.employee.entity.Employee;

@Repository
public interface EmployeRepository extends JpaRepository<Employee, Integer> {
	
	public Employee findByEmployeeId(int id);
	
 
}
