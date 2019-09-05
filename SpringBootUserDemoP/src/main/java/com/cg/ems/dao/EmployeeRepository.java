package com.cg.ems.dao;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.cg.ems.dto.Employee;

@Repository("EmpJpaDao")
@Transactional
public interface EmployeeRepository extends JpaRepository<Employee,String> {
	@Query("Select empList FRom Employee empList")
	public ArrayList<Employee> getAllEmployees();
	@Query("Select emp from  Employee emp Where emp.empId= :unm")
	public Employee getEmpById(@Param("unm") String unm);
	@Transactional
	@Modifying
	@Query("Delete from Employee emp WHere emp.empId= :unm")
	public void deleteEmpById( @Param("unm") String unm);
	@Modifying
	@Query("UPDATE Employee emp SET emp.empName=:eName Where emp.empId= :eid ")
	public void updateEmpInfo( @Param("eid") String eid,@Param("eName")String eName);

}
