package com.manish.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

import javax.validation.Valid;

import com.manish.app.entity.Department;
import com.manish.app.service.DepartmentSerivce;

@RestController
public class DepartmentController {

	
	@Autowired
	private DepartmentSerivce departmentService;
	
	
	@GetMapping("/department")
	public Department getADepartment(long departmentId)
	{
		return departmentService.getADepartment(departmentId) ;
	}
	
	@GetMapping("/departments")
	public List<Department> getAllDepartment()
	{
		return departmentService.getAllDepartment() ;
	}
	
	@PostMapping("/department")
	public Department postADipartment(@Valid @RequestBody Department department)
	{
		return departmentService.postADepaartment(department);
	}
	
	@PostMapping("/departments")
	public List<Department> postAllDepartment(@Valid @RequestBody List<Department> department)
	{
		return departmentService.postAllDepartment(department);
	}
	
	@PutMapping("/department/{id}")
	public Department updateAData(@Valid @RequestBody Department department, @PathVariable long id )
	{
		return departmentService.updateDepartment(department, id);
	}
	
	@GetMapping("/department/name/{name}")
    public Department gellDepartmentByName(@PathVariable("name") String name)
	{
		return departmentService.serachByname(name);
	}
    
	@DeleteMapping("department/delete/{id}")
    public void deleteOneData(@PathVariable("id") long departmentId)
	{

		departmentService.deleteADepartment(departmentId);
	}

	@DeleteMapping("/departments")
	public void deleteAllRecord()
	{
		departmentService.deleteAll();
	}
	
}
