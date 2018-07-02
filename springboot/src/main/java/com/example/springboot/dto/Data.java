package com.example.springboot.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Data {
	
	private String empId;
	
	private String name;
	
	private String type;
	
	private String department;
	
	private String designation;
	
	public Data() {
		
	}

	public String getName() {
		return  this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return  this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDepartment() {
		return  this.department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDesignation() {
		return  this.designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getEmpId() {
		return  this.empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "Data [empId=" +  this.empId + ", name=" +  this.name + ", type=" +  this.type + ", department=" +  this.department
				+ ", designation=" +  this.designation + "]";
	}
	
	
}
