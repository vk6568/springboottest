package com.in.main.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.in.main.pojo.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer> {
	

}
