package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	@Autowired
	public StudentRepository studentRepository;

	public Student addStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepository.save(s);
	}

	public List<Student> viewStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	public void deleteById(int usn) {
		// TODO Auto-generated method stub
		this.studentRepository.deleteById(usn);
	}

	public Student updateStudent(Student s) {
		// TODO Auto-generated method stub
		return studentRepository.save(s);
	}

	

	

	



}
