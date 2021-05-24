package com.restful.webservices.restfulwebservices.mockservices;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import com.restful.webservices.restfulwebservices.service.UserDaoService;
import com.restful.webservices.restfulwebservices.serviceImpl.UserDaoServiceImpl;
import com.restful.webservices.restfulwebservices.testcontroller.UserController;


public class UserDaoMockService {
	
	
	//for mockito 
	UserController userController= new UserController();
	
	UserDaoService userInterface = mock(UserDaoService.class);// register your service interface with mock 
	
	//@Mock
	//UserDaoService userInterface;
	
	// no use of before if you use inject mocks and mock annotations
	@BeforeEach
	public void before() {
		userController.setUserDaoService(userInterface); // register with interface 
	}
	
	@Test
	public void testResultUsingServiceStub() {
		UserController userController= new UserController();
		userController.setUserDaoService(new UserDaoServiceImpl());// register the servicimpl class with controller which is having service interface annotaion
		int actual = userController.getResult(100,100);
		int expected = 200;
		assertEquals(expected, actual);
		
	}
	
	/**
	 * here directly by interface we can invoke the method and pass the expected result 
	 * while using mock there is no dependency over the stub / serviceimpl class 
	 */
	@Test
	public void testResultUsingServiceMock() {
		when(userInterface.getSum()).thenReturn(50); // to eliminate db hit we pass the result  which is expected in return from it 
		//userController.setUserDaoService(userInterface); // register with interface // use before each
		assertEquals(60, userController.getResult());// this method will continue as it is taking the return from mock to execute further code
		
	}
}
