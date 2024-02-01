package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

//import net.bytebuddy.implementation.bind.annotation.Super;

@Entity
@Table(name="admin_table")
public class Admin {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="admin_id")
	private int adminId;
	
	
	
	@Column(name="first_name",length=20)
	@NotEmpty
//	@Size(min=3 , message="firstName must contain atleast 3 characters")
	public String firstName;
	
	@Column(name="last_name",length=20)
//	@NotEmpty
//	@Size(min=3 , message="lastName must contain atleast 3 characters")

	public String lastName;
	@Column(name="email_id",unique=true,length=30)
//	@NotEmpty
//	@Email(message="Email  is not valid!")
	public String adminEmailId;
	
	@Column(name="password",length=20)
//	@NotEmpty
//	@Size(min=8, message="Password length must be 8 and contain uppercase,lowercase,digits")
//	@Pattern(regexp="(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}")
	public String adminPassword;
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAdminEmailId() {
		return adminEmailId;
	}
	public void setAdminEmailId(String adminEmailId) {
		this.adminEmailId = adminEmailId;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", firstName=" + firstName + ", lastName=" + lastName + ", adminEmailId="
				+ adminEmailId + ", adminPassword=" + adminPassword + "+]";
	}
	
	
	
	

}
