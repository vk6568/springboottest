package com.in.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.in.main.Dao.EmployeeDao;
import com.in.main.pojo.Employee;



@Service
public class EmployeeServiceImpl implements EmployeServic {
	@Autowired
	private EmployeeDao  employeedao;

	@Override
	public List<Employee> getall(Employee employee) {
		// TODO Auto-generated method stub
		return   employeedao.findAll() ;
	}

	@Override
	public Employee saveemployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeedao.save(employee);
	}

	@Override
	public Employee updateemployee(Employee employee) {
		// TODO Auto-generated method stub
		return employeedao.saveAndFlush(employee);
	}

	@Override
	public void deleteemployee(Integer EmployeeId) {
		
		employeedao.deleteById(EmployeeId);
		
	}
	
	

}
