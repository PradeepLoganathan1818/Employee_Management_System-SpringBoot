package com.finalproject.Employee.Management.System;

import com.finalproject.Employee.Management.System.Model.Employee;
import com.finalproject.Employee.Management.System.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementSystemApplication.class, args);
	}

	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {
//		Employee e = new Employee();
//		e.setFirstname("pradeep");
//		e.setLastname("kumar");
//		e.setEmail("pradeep@gmail.com");
//
//		Employee e1 = new Employee();
//		e1.setFirstname("ranjith");
//		e1.setLastname("kumar");
//		e1.setEmail("ranjith@gmail.com");
//
//		employeeRepository.save(e);
//
//		employeeRepository.save(e1);

	}
}
