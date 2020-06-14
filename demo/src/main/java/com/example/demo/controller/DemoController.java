package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/details")
	public String getStudentDetails() {
		return "Jawed Loves Mahrukh Ashrafi";
	}
}
