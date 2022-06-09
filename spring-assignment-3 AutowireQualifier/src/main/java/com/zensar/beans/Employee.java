package com.zensar.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	
	private int EmployeeId;
	private String EmployeeName;
	private int EmployeeAge;
	@Autowired
	@Qualifier("NonTech")
	private Department department;

	
	public Employee() {
		super();
	}
	
	
	public Employee(int employeeId, String employeeName, int employeeAge, Department department) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeAge = employeeAge;
		this.department = department;
	}


	public Employee(int employeeId, String employeeName, int employeeAge) {
		super();
		EmployeeId = employeeId;
		EmployeeName = employeeName;
		EmployeeAge = employeeAge;
	}
	public int getEmployeeId() {
		return EmployeeId;
	}
	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	public String getEmployeeName() {
		return EmployeeName;
	}
	public void setEmployeeName(String employeeName) {
		EmployeeName = employeeName;
	}
	public int getEmployeeAge() {
		return EmployeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		EmployeeAge = employeeAge;
	}
	
	
	public Department getdepartment() {
		return department;
	}


	public void setdepartment(Department department) {
		this.department = department;
	}


	@Override
	public String toString() {
		return "Employee [EmployeeId=" + EmployeeId + ", EmployeeName=" + EmployeeName + ", EmployeeAge=" + EmployeeAge
				+ ", department=" + department + "]";
	}



	
	
}
