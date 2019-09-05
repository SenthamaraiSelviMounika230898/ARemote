package com.cg.ems.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ems.dto.Employee;
import com.cg.ems.service.EmployeeService;

import com.cg.ems.exceptions.UserNotFoundException;


@RestController
public class EmployeeController {


		@Autowired
		EmployeeService logSer;

	@PostMapping(value="/addUser",consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json",produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee createUser(@RequestBody Employee log)
	{
		System.out.println("Employee Controller");
		logSer.addEmployee(log);
		Employee lgg= logSer.getEmpById(log.getEmpId());
		return lgg;
		
	}
	/********************************************************************/



	@DeleteMapping(value="/deleteUser/{eid}",headers="Accept=application/json")
	public String deleteUser(@PathVariable ("eid")String  unm)
	{
		
		
		logSer.deleteEmpById(unm);
		 return " Data Deleted.........";

	}
	@PutMapping(value="/user/update/",consumes=MediaType.APPLICATION_JSON_VALUE,headers="Accept=application/json")
	public void updateUser(@RequestBody Employee lg)
	{
		logSer.updateEmpInfo(lg.getEmpId(),lg.getEmpName());
		System.out.println("Data updated in the table");
	}

	@GetMapping(value="searchUser/{eid}")
	public  Employee searchUserById(@PathVariable("eid")String unm)  throws UserNotFoundException 
	{Employee lgg=logSer.getEmpById(unm);
		
		if(lgg==null)
		{
			throw new UserNotFoundException("No User With this Name");
		}
		else
		{
			return lgg;
		}
		

		

	}

}
