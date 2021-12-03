package com.example.hackathon.controller;
import com.example.hackathon.model.User;
import com.example.repo.UserRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:4200")
public class UserController {
	@Autowired
	private UserRepo repo;
	
	@PostMapping("/user")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
		
		return ResponseEntity.ok(repo.save(user); 
	}

}
