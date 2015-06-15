package com.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.entity.User;
import com.spring.reporitory.UserReporitory;

@Service
public class UserService {

	@Autowired 
	private UserReporitory userReporitory;
	
	public List<User> findAll(){
		return userReporitory.findAll();
	}

	public User findone(int id) {
		
		
		return userReporitory.findOne(id);
	}
	
	
	
	
}
