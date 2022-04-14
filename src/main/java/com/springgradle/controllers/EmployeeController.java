package com.springgradle.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springgradle.entities.Employee;
//import com.springgradle.entities.Employee;
//import com.springgradle.exceptions.IdNotFoundException;
import com.springgradle.service.EmployeeService;

import java.util.List;
//CRUD operations using spring jpa
@RestController
@RequestMapping("/employee")

public class EmployeeController {
	
	@Autowired(required=true)
	EmployeeService service;
	
	@RequestMapping(value="/retrieve",method=RequestMethod.GET)
	public List<Employee> getAllEmployees(){
		return service.getAllEmployees1();
	}


//	@RequestMapping(value = "/emp/{id}",method = RequestMethod.GET)
//	public ResponseEntity<Employee> getEmployeeById(@PathVariable int id) throws IdNotFoundException {
//		return service.getEmployeeById(id);
//	}
	
	
	
	
	

	@RequestMapping(value = "/add",method = RequestMethod.POST)
	public Employee addEmployee(@RequestBody Employee e) {
		return service.addEmployee(e);
	}
    
	@RequestMapping(value ="/update/{id}",method = RequestMethod.PUT)
	public Employee updateEmployee(@PathVariable int id, @RequestBody Employee e) {
		return service.updateEmployee(id,e);
	}
	

	
	@RequestMapping(value="/delete/{id}",method=RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable int id) {
		return service.deleteEmployee(id);
	}

	
	
}
