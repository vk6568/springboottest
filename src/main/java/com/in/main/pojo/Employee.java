package com.in.main.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Table(name="sprdb_test")
@Entity
public class Employee {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="employee_id")
	private int EmployeeId;
	@Column(name="EmployeeName")
	private String empname;
    @Column(name="Desiganation")
    private String desiganation;
    
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int employeeId, String empname, String desiganation) {
		super();
		EmployeeId = employeeId;
		this.empname = empname;
		this.desiganation = desiganation;
	}

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}

	public String getEmpname() {
		return empname;
	}

	public void setEmpname(String empname) {
		this.empname = empname;
	}

	public String getDesiganation() {
		return desiganation;
	}

	public void setDesiganation(String desiganation) {
		this.desiganation = desiganation;
	}

	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", empname=" + empname + ", desiganation=" + desiganation + "]";
	}
    
    


}
