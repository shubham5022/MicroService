package com.jwt.example.controllers;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.example.model.User;
import com.jwt.example.userService.UserService;

@RestController
@RequestMapping("/home")
public class HomeController {

	@Autowired
	private UserService userService;

	@GetMapping("/user")
	public List<User> getUser() {

		System.out.println("getting users....4");
		return this.userService.getUsers();

	}
	
	@GetMapping("/currentUser")
	public String getLoggedInUser(Principal principal) {
		return principal.getName();
	}

}
