package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Company;
import com.example.demo.service.CompanyService;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService cs;
	
	@GetMapping("display")
	public List<Company>displayCompany(){
		return cs.display();
	}
	
	@PostMapping("add")
	public void addCompany(Company c) {
		cs.add(c);
	}
}
