package com.restful.webservices.restfulwebservices.poc.arraylistpoc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

import com.restful.webservices.restfulwebservices.testbeans.Employee;
import com.restful.webservices.restfulwebservices.testbeans.User;

/**
 * 
 * sorting techniques
 * 
 * @author dev_bhaskar
 *
 */

public class CustomSortingList {

	/**
	 * method to sort employee by Id where domain implements comparable interface
	 */
	public static void sortEmployeeById() {

		// create list of employee objects
		List<Employee> emp = new ArrayList<>(); // where domain implements comparable interface

		// add details
		emp.add(new Employee(1001, "bhaskar", 10000));
		emp.add(new Employee(1002, "ramya", 20000));
		emp.add(new Employee(1003, "pankaj", 30000));
		emp.add(new Employee(1004, "ajit", 40000));
		emp.add(new Employee(1005, "venkat", 50000));
		emp.add(new Employee(1006, "krishna", 60000));

		Collections.sort(emp);
		System.out.println("******Natural order Sorting********");
		emp.stream().forEach(System.out::println); // sorting based on ID in natural order

		System.out.println("******Reverse order Sorting********");

		Collections.sort(emp, Collections.reverseOrder());
		emp.stream().forEach(System.out::println); // sorting based on ID in reverse order
	}

	/**
	 * method to sort user where user doesn't implement any comparable interface
	 * 
	 * @param args
	 */

	public static void sortUser() {
		
		// create list of user
		List<User> user = new ArrayList<>();
		// add users
		user.add(new User(1, "bhaskar", new Date()));
		user.add(new User(2, "shyama", new Date()));
		user.add(new User(3, "raju", new Date()));
		user.add(new User(4, "venkat", new Date()));
		// compare by id
		Comparator<User> userById= (User u1, User u2)-> u1.getId().compareTo(u2.getId());
		System.out.println("************ sort user by id natural order **********");
		Collections.sort(user, userById);
		user.stream().forEach(System.out::println);
		
		// compare by id in reverse manner
		Comparator<User> userByIdReverse = (User u1, User u2) -> u1.getId().compareTo(u2.getId());
		System.out.println("************ sort user by id in reverse order **********");
		Collections.sort(user, Collections.reverseOrder(userByIdReverse));
		user.stream().forEach(System.out::println);
		
		//compare by name field
		System.out.println("************ sort user by name natural order **********");
		Comparator<User> userByName= (User u1, User u2)-> u1.getName().compareTo(u2.getName());
		Collections.sort(user, userByName);
		user.stream().forEach(System.out::println);
		
		// compare by name field in reverse order
		System.out.println("************ sort user by name reverse order **********");
		Comparator<User> userByNameReverse = (User u1, User u2) -> u1.getName().compareTo(u2.getName());
		Collections.sort(user, Collections.reverseOrder(userByNameReverse));
		user.stream().forEach(System.out::println);
	}

	public static void main(String[] args) {

		sortEmployeeById();
		sortUser();
	}

}
