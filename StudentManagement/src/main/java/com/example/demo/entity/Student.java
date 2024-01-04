package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Student {
	@Id
	private int usn;
	private String name;
	private String branch;
	private float fee;
	private String email;
	
	@OneToOne
	private Department department;
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "Student [usn=" + usn + ", name=" + name + ", branch=" + branch + ", fee=" + fee + ", email=" + email
				+ "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int usn, String name, String branch, float fee, String email) {
		super();
		this.usn = usn;
		this.name = name;
		this.branch = branch;
		this.fee = fee;
		this.email = email;
	}
	public int getUsn() {
		return usn;
	}
	public void setUsn(int usn) {
		this.usn = usn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public float getFee() {
		return fee;
	}
	public void setFee(float fee) {
		this.fee = fee;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
