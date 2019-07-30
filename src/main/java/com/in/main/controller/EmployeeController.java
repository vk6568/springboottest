package com.in.main.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.in.main.pojo.Employee;
import com.in.main.service.EmployeeServiceImpl;



@RestController
@RequestMapping("/api")
public class EmployeeController {
	@Autowired
	private EmployeeServiceImpl employeeservice;
	
	@GetMapping("/alldata")
	public List<Employee> getall(Employee employee) {
		
		return   employeeservice.getall(employee);
	}
	
	@PostMapping("/save")
	public Employee saveemployee(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		return employeeservice.saveemployee(employee);
	}
	
	@PutMapping("/update")
	public Employee updateemployee(@RequestBody Employee employee) {
		// TODO Auto-generated method stub
		return employeeservice.updateemployee(employee);
	}
	
     @DeleteMapping("/delete/{employeeId}")
	public void  deleteemployee(@PathParam(value ="EmployeeId") Integer EmployeeId) {
		
		   employeeservice.deleteemployee(EmployeeId);
		
		
	}

}
