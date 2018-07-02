package com.example.springboot.service.employee;

import java.io.ByteArrayInputStream;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.springframework.stereotype.Service;
import com.example.springboot.dto.EmployeeData;
import com.example.springboot.service.DataHandler;

@Service(value="empDtdHdlr")
public class EmployeeDataHandler implements DataHandler {

	public EmployeeData getEmployees() {
		return unMarshallEmployee();
	}
	
	private EmployeeData unMarshallEmployee() {
		EmployeeData eData = null;
		try {
			JAXBContext jc  = JAXBContext.newInstance(EmployeeData.class);
			Unmarshaller uMar = jc.createUnmarshaller();
			eData = (EmployeeData) uMar.unmarshal(new ByteArrayInputStream("<employee> <id>123</id>    <lsData>        <department>BCI</department>        <designation>SE</designation>        <empId>101</empId>        <name>Kedar</name>        <type>Tester</type>    </lsData>    <lsData>        <department>EDC</department>        <designation>STE</designation>        <empId>100</empId>        <name>Sumeet</name>        <type>Tester</type>    </lsData></employee>".getBytes()));
		} catch (JAXBException e) {
			e.printStackTrace();
		}
	    return eData;
	}

}
