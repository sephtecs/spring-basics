package com.training.spring;

public class Employee {
	
	private String employeeName;

	public Employee() {
		System.out.println("Employee default constructor called");
	}
	
	public Employee(String employeeName) {
		super();
		this.employeeName = employeeName;
		System.out.println("Employee parametrized called called");
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	

}
