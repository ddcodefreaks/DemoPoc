package com.restful.webservices.restfulwebservices.testcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restful.webservices.restfulwebservices.testbeans.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	
	
	/**
	 * create a get method helloWorld
	 * URI- /hello-world
	 * http type - GET method 
	 */
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "hello-bhaskaryacharya";
	}
	
	
	/**
	 * create a method helloWordBean which returns a bean
	 * uri -- hello-world-bean
	 * return type -- bean 
	 */
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new  HelloWorldBean("Hello-World-bean");
	}
	
	/**
	 * example of path variable for the same get request 
	 */

	@GetMapping("/hello-world/{name}")
	public HelloWorldBean helloWorlPathVariable(@PathVariable String name) {
		return new  HelloWorldBean(String.format("Hello World,%s", name));
	}
	


	

}
