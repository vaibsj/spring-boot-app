package com.example.demo.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.IUserService;

/*
* Controller class
*/
@RestController
@RequestMapping("/demo")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@GetMapping("/users")
	public ResponseEntity<?> getUsers() {
		//return users
		return ResponseEntity.status(HttpStatus.OK).body(userService.getUsers());
	}
}
