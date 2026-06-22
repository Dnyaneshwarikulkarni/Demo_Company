package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Company;
import com.example.demo.repository.CompanyRepository;
@Service
public class CompanyServiceImpl implements CompanyService {
	
	@Autowired
	private CompanyRepository cr;
	
	@Override
	public void add(Company c) {
		// TODO Auto-generated method stub
		cr.save(c);
		
	}

	@Override
	public List<Company> display() {
		// TODO Auto-generated method stub
		return cr.findAll();
	}

}
