package com.javaproject.ems.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaproject.ems.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
	
	

}

