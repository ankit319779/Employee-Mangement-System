package com.javaproject.ems.service;

import java.util.List;

import com.javaproject.ems.dto.EmployeeDto;

public interface EmployeeService {
	EmployeeDto createEmployee(EmployeeDto employeeDto);
	
	EmployeeDto getEmployeeById(Long emoloyeeId);
	List<EmployeeDto> getAllEmployees();

	EmployeeDto updateEmployee(Long employeeId, EmployeeDto updateEmployee);
	
	
	void deleteEmployee(Long employeeId);
	

}
