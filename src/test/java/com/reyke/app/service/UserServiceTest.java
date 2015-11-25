package com.reyke.app.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserServiceTest {

	@Test
	public void test(){
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring.xml");
	
	    UserService userService = (UserService) context.getBean("userService");
	    
	    userService.printUser();
	}
}
