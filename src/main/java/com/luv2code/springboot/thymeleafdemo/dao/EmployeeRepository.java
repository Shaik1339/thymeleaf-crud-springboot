package com.luv2code.springboot.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luv2code.springboot.thymeleafdemo.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	// that's it ... no need to write any code LOL!
	//add a method to sort by last name
    public List<Employee> findAllByOrderByLastNameAsc();
    //spring data JPA will parse the method name, looks for specific format and pattern creates appropriate Query
    // behind scenes



}
