package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Customer;

public interface CustomerService {
	Customer saveCustomer(Customer customer);
	Customer loginCustomer(Customer customer);
	Customer updateCustomer(Customer customer, long customerId);
	Customer getCustomerById(long customerId);
	List<Customer> getAllCustomers();
	Customer getCustomerByEmail(Customer customer);
	void deleteCustomer(long customerId);

}