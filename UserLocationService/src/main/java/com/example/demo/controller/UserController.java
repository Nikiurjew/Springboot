package com.example.demo.controller;

import java.awt.desktop.UserSessionEvent;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import com.example.demo.entity.UserLocation;
import com.example.demo.repository.UserLocationRepository;
import com.example.demo.service.UserLocationService;


@RestController
@RequestMapping("/api/users")
public class UserController {
	
	@Autowired
	private UserLocationRepository userLocationRepository;
	
	@Autowired
	private UserLocationService userLocation_Service;
	
	

	//Implement crete_data, update_data,get_users
	
	@GetMapping("/all")
	public String viewAlluserLocation() {
		return "You can see the User Details";
	}
	//1.create_data 
//	@PostMapping("/add")
//	public UserLocation createData(@RequestBody UserLocation u) {
//		return userLocationRepository.save(u);
//		
//	}
	@PostMapping("/add")  //http://localhost:8081/employee/add
	public UserLocation addLocation(@RequestBody UserLocation u) {
		return userLocation_Service.addLocation();
		
	}
	//2.Retrive_data
//	@GetMapping("/view")  //http://localhost:8081/employee/view
//	public List<UserLocation> viewLocation(){
//		return userLocationRepository.findAll();
//	}
	@GetMapping("/view")  //http://localhost:8081/employee/view
	public List<UserLocation> viewLocation(){
		return userLocation_Service.viewLocation();
	}
	
	
}
