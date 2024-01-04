package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	public StudentService studentService;
	
	@GetMapping("/all")
	public String viewAllstudent() {
		return "you can see the student Details";
	}
	//1.insert
	@PostMapping("/add")
	public Student addStudent(@RequestBody Student s) {
		return studentService.addStudent(s);
	
	}
	//2.Retrive
	@GetMapping("/view")
	public List<Student> viewStudents(){
		return studentService.viewStudents();	
	}
	//3.Delete
	@DeleteMapping("/delete/{usn}")
	public void deleteById(@PathVariable int usn) {
		this.studentService.deleteById(usn);
	}
	@PutMapping("/edit/{usn}")
	public Student updateStudent(@RequestBody Student s) {
		return studentService.updateStudent(s);
		
	}
}
