package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Admin1;

public interface AdminRepository extends JpaRepository<Admin1, Integer> {
	
}
