package com.restful.webservices.restfulwebservices.serviceImpl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restful.webservices.restfulwebservices.service.UserDaoService;
import com.restful.webservices.restfulwebservices.testbeans.User;

/**
 * To cater business logic
 * @author dev_bhaskar
 *
 */

@Service
public class UserDaoServiceImpl implements UserDaoService {
	
	@Override
	public List<User> intializeData() {
		
		List<User> user = new ArrayList<>();
		
		try {
			user.add(new User(1, "anup", new Date()));
			user.add(new User(2, "shyama", new Date()));
			user.add(new User(3, "shruti", new Date()));
			user.add(new User(4, "venkat", new Date()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public int getSum(int x, int y) {
		System.out.println(" getSum method called value::"+ Integer.valueOf(x+y));
		return x+y;
	}

	@Override
	public int getSum() {
		System.out.println(" getSum method called with no argument");
		return 10;
	}

}
