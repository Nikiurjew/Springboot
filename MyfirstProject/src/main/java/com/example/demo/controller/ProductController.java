package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
@GetMapping("/all")
public String getAllProduct() {
	return "u can place your order";
}
}
