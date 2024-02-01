package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.demo.Repository.AdminRepository;

import com.example.demo.model.Admin1;
@Service
public class AdminService {
	@Autowired
	public AdminRepository adminRepository;

	public Admin1 addAdmin(Admin1 a) {
		// TODO Auto-generated method stub
		return adminRepository.save(a);
	}

	public List<Admin1> viewAdmin() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}
}

 
