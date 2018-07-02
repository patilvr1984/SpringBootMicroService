package com.example.springboot.dto;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="employee")
public class EmployeeData {
	
	private String id;
	private List<Data> lsData;
	
	public EmployeeData() {
		
	}

	public String getId() {
		return  this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Data> getLsData() {
		if( this.lsData == null) {
			 this.lsData = new ArrayList<Data>();
		}
		return  this.lsData;
	}

	public void setLsData(List<Data> lsData) {
		this.lsData = lsData;
	}

	@Override
	public String toString() {
		return "EmployeeData [id=" +  this.id + ", lsData=" +  this.lsData + "]";
	}

	

}
