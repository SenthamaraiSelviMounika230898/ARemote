package com.cg.ems.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.ems.dao.EmployeeRepository;
import com.cg.ems.dto.Employee;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired 
	  EmployeeRepository empDao;
	
	@Override
	public ArrayList<Employee> getAllEmployees() {
		
		return empDao.getAllEmployees();
	}

	@Override
	public Employee addEmployee(Employee log) {
		// TODO Auto-generated method stub
		return empDao.save(log);
	//	return null;
		
	}

	@Override
	public Employee getEmpById(String unm) {
		// TODO Auto-generated method stub
		return empDao.getEmpById(unm);
	}

	@Override
	public void deleteEmpById(String unm) {
		 empDao.deleteEmpById(unm);
	}

	@Override
	public void updateEmpInfo(String eid, String eName) {
		empDao.updateEmpInfo(eid, eName);
		
	}

	
	
	
}
