package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Department;
import com.example.demo.repository.DepartmentRepository;

@Service
public class DepartmentService {
@Autowired
public DepartmentRepository departmentRepository;

public Department addDepartment(Department d) {
	// TODO Auto-generated method stub
	return departmentRepository.save(d);
}


}
