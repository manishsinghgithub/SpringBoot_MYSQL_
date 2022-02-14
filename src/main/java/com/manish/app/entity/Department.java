package com.manish.app.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;





@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long departmentId;

	@NotBlank(message = "Department name can not empty.")
	private String departmentName;
	private String departmentAdd;
	private String departmentCode;
	
	
	public Department() {
		
	}
	public Department(long departmentId, String departmentName, String departmentAdd, String departmentCode) {
		
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.departmentAdd = departmentAdd;
		this.departmentCode = departmentCode;
	}
	public long getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(long departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getDepartmentAdd() {
		return departmentAdd;
	}
	public void setDepartmentAdd(String departmentAdd) {
		this.departmentAdd = departmentAdd;
	}
	public String getDepartmentCode() {
		return departmentCode;
	}
	public void setDepartmentCode(String departmentCode) {
		this.departmentCode = departmentCode;
	}



}
