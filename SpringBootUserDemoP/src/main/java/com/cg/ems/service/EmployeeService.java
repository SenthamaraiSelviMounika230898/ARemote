package com.cg.ems.service;

import java.util.ArrayList;
import org.springframework.stereotype.Service;

import com.cg.ems.dto.Employee;


@Service
public interface EmployeeService {
	public ArrayList<Employee> getAllEmployees();
	public Employee addEmployee(Employee log);
	public Employee getEmpById(String unm);
	public void deleteEmpById( String unm);
	public void updateEmpInfo(String eid,String eName);
}
