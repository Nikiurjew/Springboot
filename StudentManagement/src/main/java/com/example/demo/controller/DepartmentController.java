package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;
import com.example.demo.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	@Autowired
	public DepartmentService departmentService;
	
	@GetMapping("/all")
	public String viewAlldepartment() {
		return "you can see the department details";
	}
	@PostMapping("/add")
	public Department addDepartment(@RequestBody Department d) {
		return departmentService.addDepartment(d);
		
		
	}
}
