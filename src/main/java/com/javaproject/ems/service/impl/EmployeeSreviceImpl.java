package com.javaproject.ems.service.impl;


import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import com.javaproject.ems.Mapper.EmployeeMapper;
import com.javaproject.ems.dto.EmployeeDto;
import com.javaproject.ems.entity.Employee;
import com.javaproject.ems.exception.ResourceNotFoundException;
import com.javaproject.ems.repository.EmployeeRepository;
import com.javaproject.ems.service.EmployeeService;


@Service
public class EmployeeSreviceImpl implements EmployeeService {
	private EmployeeRepository employeeRepository;
	
    
	public EmployeeSreviceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}


	@Override
	public EmployeeDto createEmployee(EmployeeDto employeeDto) {
		
		Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
		Employee savedEmployee = employeeRepository.save(employee);
		return EmployeeMapper.mapToEmployeeDto(savedEmployee);
	}


	@Override
	public EmployeeDto getEmployeeById(Long employeeId) {
		Employee employee = employeeRepository.findById(employeeId)
			.orElseThrow(()->
					new ResourceNotFoundException("Employee is not exit with given id :" +employeeId));
		
		return EmployeeMapper.mapToEmployeeDto(employee);
	}


	@Override
	public List<EmployeeDto> getAllEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		
		return employees.stream().map((employee) -> EmployeeMapper.mapToEmployeeDto(employee))
				.collect(Collectors.toList());
	}

	@Override
	public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployee) {
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(
				()-> new ResourceNotFoundException("Employee is not exits with given id!.."));
		employee.setFirstName(updatedEmployee.getFirstName());
		employee.setLastname(updatedEmployee.getLastName());
		employee.setEmail(updatedEmployee.getEmail());
		Employee updateEmployeeObj = employeeRepository.save(employee);
		
		return EmployeeMapper.mapToEmployeeDto(updateEmployeeObj);
	}


	@Override
	public void deleteEmployee(Long employeeId) {
		Employee employee = employeeRepository.findById(employeeId).orElseThrow(
				()-> new ResourceNotFoundException("Employee is not exits with given id!.." +employeeId));
		employeeRepository.deleteById(employeeId);

		
		
	} 	

}
