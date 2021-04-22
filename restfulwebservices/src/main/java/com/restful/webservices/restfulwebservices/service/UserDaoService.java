package com.restful.webservices.restfulwebservices.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.restful.webservices.restfulwebservices.testbeans.User;


public interface UserDaoService {

	
	public List<User> intializeData();
	
}
