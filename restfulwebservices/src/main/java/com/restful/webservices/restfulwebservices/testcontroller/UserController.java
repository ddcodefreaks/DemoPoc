package com.restful.webservices.restfulwebservices.testcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restful.webservices.restfulwebservices.service.UserDaoService;
import com.restful.webservices.restfulwebservices.testbeans.User;

@RestController
public class UserController {
	
	@Autowired
	private UserDaoService userDaoService;
	
	
	/**
	 * create a get method to fetch user entries 
	 *
	 */
	@GetMapping("/users")
	public List<User> getUser(){
		
		
		List<User> user= userDaoService.intializeData();
		
		return user;
	
		
	}

}
