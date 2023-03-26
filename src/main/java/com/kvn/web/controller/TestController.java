package com.kvn.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class TestController {
	
	@GetMapping("/user")
	public String getUser() {
		System.out.println("received Request");
		return "Prabhu";
	}
	@GetMapping("/user/{id}")
	public String getUser(@PathVariable String id) {
		System.out.println("Path variable :"+id);
		return "Prabhu "+id;
	}

}
