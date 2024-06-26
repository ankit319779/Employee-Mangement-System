package com.javaproject.ems.Mapper;

import com.javaproject.ems.dto.EmployeeDto;
import com.javaproject.ems.entity.Employee;
 
public class EmployeeMapper {
	
	public static Employee mapToEmployee(EmployeeDto employeeDto) {
		return new Employee(
				employeeDto.getId(),
				employeeDto.getFirstName(),
				employeeDto.getLastName(),
				employeeDto.getEmail()

				
				
		
				
		);
		
		
	}
	public static EmployeeDto mapToEmployeeDto(Employee employee) {
		return new EmployeeDto(
				employee.getId(),
				employee.getFirstName(),
				employee.getLastname(),
				employee.getEmail()
			
					
					
			);
	}

}
