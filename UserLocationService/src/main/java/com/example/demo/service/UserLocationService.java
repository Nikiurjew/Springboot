package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.example.demo.entity.UserLocation;
import com.example.demo.repository.UserLocationRepository;

@Service
public class UserLocationService {
	@Autowired
	public static UserLocationRepository userLocationRepository;
	
	
	
//	public static UserLocation addLocation(UserLocation u) {
//		return userLocationRepository.save(u);
//		
//	}



	public List<UserLocation> viewLocation() {
		// TODO Auto-generated method stub
		//return userLocationRepository.findAll();
		return userLocationRepository.findAll();
	}



	public UserLocation addLocation() {
		// TODO Auto-generated method stub
		return null;
	}



	

	



}
