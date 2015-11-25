package com.reyke.app.service.impl;

import org.springframework.stereotype.Service;

import com.reyke.app.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	
	public void printUser() {
		System.out.println("This is user name.");
	}

}
