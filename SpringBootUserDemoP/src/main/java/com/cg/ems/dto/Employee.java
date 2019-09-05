package com.cg.ems.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EmployeeLab")
public class Employee {
	 @Id
   //  @Column(name="emp_Id")
	private  String empId;
	//  @Column(name="emp_Name")
	private String empName;
	 // @Column(name="emp_destination")
	private String destination;
	 // @Column(name="emp_Sal")
	private double empSal;
	 // @Column(name="dept_Name")
	private String deptName;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String empId, String empName, String destination, double empSal, String deptName) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.destination = destination;
		this.empSal = empSal;
		this.deptName = deptName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public double getEmpSal() {
		return empSal;
	}
	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", destination=" + destination + ", empSal="
				+ empSal + ", deptName=" + deptName + "]";
	}
	
}
