package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.springboot.dto.EmployeeData;
import com.example.springboot.service.DataHandler;

@RestController("/emp")
public class EmployeeDataService {
	
	@Autowired
	@Qualifier(value="empDtdHdlr")
	private DataHandler empDtdHdlr;

	@RequestMapping(method=RequestMethod.GET)
	public EmployeeData getEmployees(){
		return this.empDtdHdlr.getEmployees();
	}
	
}
