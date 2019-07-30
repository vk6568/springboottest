package com.in.main.service;

import java.util.List;

import com.in.main.pojo.Employee;



public interface EmployeServic {
	
	List<Employee> getall(Employee employee);
	Employee saveemployee(Employee employee);
	Employee updateemployee(Employee employee);
	void deleteemployee(int  EmployeeId);
		
		
}
