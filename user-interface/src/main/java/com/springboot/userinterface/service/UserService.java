package com.springboot.userinterface.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.userinterface.domain.Login;
import com.springboot.userinterface.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	
	private UserRepository repo;
	public Login login(String username, String password)
	{
		Login user = repo.findByUsernameAndPassword(username, password);
		
		return user;
		
	}
	
	
	
	

}
