package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Admin;
import com.example.demo.entity.Customer;
import com.example.demo.entity.Product;

public interface AdminService {
	Admin saveAdmin(Admin admin);
	Admin loginAdmin(Admin admin);
	
	public List<Product> getAllProducts(long adminId);
	public List<Customer> getAllCustomers(long adminId);
}