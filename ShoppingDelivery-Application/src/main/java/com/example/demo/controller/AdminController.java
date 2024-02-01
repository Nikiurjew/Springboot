package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Admin1;
import com.example.demo.service.AdminService;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@GetMapping("/all")
	public String viewAllstudent() {
		return "you can see the admin details";
	}
	@PostMapping("/add")
	public Admin1 addAdmin(@RequestBody Admin1 a) {
		return adminService.addAdmin(a);
	}
	@GetMapping("/view")
	public List<Admin1> viewAdmin(){
		return adminService.viewAdmin();
	}
	
}
