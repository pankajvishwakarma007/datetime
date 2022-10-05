package com.pkj.spring_boot_datetime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DTController {
	
	@Autowired
	DTService  dtp;
	
	@GetMapping(value = "/")
	public String printDatetime()   {
		String strResult=dtp.dtCall();
		return strResult;
	}
	

}
