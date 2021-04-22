package com.restful.webservices.restfulwebservices.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restful.webservices.restfulwebservices.service.UserDaoService;
import com.restful.webservices.restfulwebservices.testbeans.User;

@Service
public class UserDaoServiceImpl implements UserDaoService {

	@Override
	public List<User> intializeData() {
		
		List<User> user = new ArrayList<>();
		
		user.add(new User(1, "bhaskar", new Date()));
		user.add(new User(2, "shyama", new Date()));
		user.add(new User(3, "ranga", new Date()));
		user.add(new User(4, "venkat", new Date()));
		
		return user;
	}

}
