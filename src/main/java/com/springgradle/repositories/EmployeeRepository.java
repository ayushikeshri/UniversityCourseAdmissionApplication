package com.springgradle.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springgradle.entities.Employee;
//import com.springgradle.entities.Employee;



@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Integer>{

}


