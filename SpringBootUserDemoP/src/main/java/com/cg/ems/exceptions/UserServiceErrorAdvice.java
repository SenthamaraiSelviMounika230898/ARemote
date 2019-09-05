package com.cg.ems.exceptions;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class UserServiceErrorAdvice {
   
	
	@ResponseBody
    @ResponseStatus(value=HttpStatus.NOT_FOUND)
	@ExceptionHandler(value=Exception.class)
	protected  ErrorInfo handleconflicts(Exception e,HttpServletRequest request)
	{
		String bodyOfResponse= e.getMessage();
		String url= request.getRequestURL().toString();
		System.out.println("handle Conflict Error Message "+bodyOfResponse +" Req URL "+url);
		return new ErrorInfo(url,bodyOfResponse);
		
	}
	
	
	
	@ExceptionHandler({UserNotFoundException.class,SQLException.class})
	protected ResponseEntity<String> handle2(UserNotFoundException unfexp)
	{
		
		return error(HttpStatus.INTERNAL_SERVER_ERROR,unfexp);
		
	}
	
	protected ResponseEntity<String> error(HttpStatus status,UserNotFoundException ee)
	{
		return ResponseEntity.status(status).body(ee.getMessage());
	}
	
}
