package com.manish.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;
import com.manish.app.entity.Department;
import com.manish.app.repository.DepartmentRepository;

@Service
public class DepartmentSerivce {
         
	@Autowired
	private DepartmentRepository departmentRepository;
	
	//Getting All list of data entity.
	public List<Department> getAllDepartment()
	{
		return departmentRepository.findAll();
	}
	
	
	//Getting One Entity from database using Id;
	public Department getADepartment(long id)
	{
		return departmentRepository.getById(id);
	}
	
	
	//Save a entity to database;
	
	public Department postADepaartment(Department department)
	{
		 return departmentRepository.save(department);
	
	}
	
	
	public Department serachByname(String name)
	{
		 
		return departmentRepository.findByDepartmentName(name);
	}
	
	
	
	//Delete all record;
	public void deleteAll()
	{
		departmentRepository.deleteAll();
	}
    
	//update a Departement;
	
	public Department updateDepartment(Department department, long id )
	{
		return departmentRepository.save(department);
	}

	public List<Department> postAllDepartment(List<Department> department) {
		
		return departmentRepository.saveAllAndFlush(department);
	}
	
	
	public void deleteADepartment(long id)
	{
		departmentRepository.deleteById(id);
	}
	

	
	
	
}
