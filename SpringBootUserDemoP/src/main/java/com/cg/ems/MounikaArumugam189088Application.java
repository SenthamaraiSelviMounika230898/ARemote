package com.cg.ems;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.cg.ems")
public class MounikaArumugam189088Application {

	public static void main(String[] args) {
		SpringApplication.run(MounikaArumugam189088Application.class, args);
		System.out.println("Welcome");
	}

}
