package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserLocation;
import java.util.List;
import java.util.Optional;


public interface UserLocationRepository extends JpaRepository<UserLocation, Integer> {
	//Optional<UserLocation> findByname(String name);
// customer queries if needed
}
