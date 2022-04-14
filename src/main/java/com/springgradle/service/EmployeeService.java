package com.springgradle.service;

import org.apache.catalina.startup.ClassLoaderFactory.Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springgradle.entities.Employee;
//import com.springgradle.exceptions.IdNotFoundException;
import com.springgradle.repositories.EmployeeRepository;

import java.util.List;

@Service
public class EmployeeService {
	@Autowired(required = true)
EmployeeRepository repository;
	public List<Employee> getAllEmployees1(){
		return  repository.findAll();
	}

	


//	public ResponseEntity<Employee> getEmployeeById(int id) throws IdNotFoundException{
//		Employee e1 = repository.findById(id).orElseThrow(()-> new IdNotFoundException("no employee with this id"));
//		return ResponseEntity.ok().body(e1);
//	}
//	
	
	

	
	public Employee addEmployee(Employee e) {
	return repository.save(e);

}


	public Employee updateEmployee(int id, Employee e) {
		Employee e1 = repository.findById(id).get();
		if(e1!=null) {
			e1.setEname(e.getEname());
			e1.setEsal(e.getEsal());
			return repository.save(e1);
		}
		else
		
		return null;
	}


	public String deleteEmployee(int id) {
		Employee e1=repository.findById(id).get();
		if(e1==null)
		{
			return "no record present with given id";
		}
		else {
			repository.delete(e1);
			return"employee deleted sucessfully";
		}
	}



	



	
	

}