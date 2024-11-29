package com.javaknowledge.findingByRole;

import java.util.Objects;

public class Employee {
	
	public Integer employeeId;
	
	public String employeeName;
	
	public String employeeRole;
	
	public Integer employeeSalary;
	
	public String employeeLocation;
	
	public Employee() {
		
		System.out.println(" Employers data sucessfully found.....");
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeeRole() {
		return employeeRole;
	}

	public void setEmployeeRole(String employeeRole) {
		this.employeeRole = employeeRole;
	}

	public Integer getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(Integer employeeSalary) {
		this.employeeSalary = employeeSalary;
	}

	public String getEmployeeLocation() {
		return employeeLocation;
	}

	public void setEmployeeLocation(String employeeLocation) {
		this.employeeLocation = employeeLocation;
	}

	public Employee(Integer employeeId, String employeeName, String employeeRole, Integer employeeSalary,
			String employeeLocation) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeRole = employeeRole;
		this.employeeSalary = employeeSalary;
		this.employeeLocation = employeeLocation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeRole="
				+ employeeRole + ", employeeSalary=" + employeeSalary + ", employeeLocation=" + employeeLocation + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeId, employeeLocation, employeeName, employeeRole, employeeSalary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeId, other.employeeId) && Objects.equals(employeeLocation, other.employeeLocation)
				&& Objects.equals(employeeName, other.employeeName) && Objects.equals(employeeRole, other.employeeRole)
				&& Objects.equals(employeeSalary, other.employeeSalary);
	}
	
	
	

}
