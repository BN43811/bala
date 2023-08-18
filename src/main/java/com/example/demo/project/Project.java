package com.example.demo.project;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Project {
	@Value("12")
	public int regNum;
	@Value("Bala")
	public String name;
	@RequestMapping("/disp")
	public String display()
	{
		return "My Name is "+name +"Reg number is "+regNum;
	}

}
