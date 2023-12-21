package com.jwt.example.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.model.User;

@Service
public class UserService {
	
	private List<User> list = new ArrayList<>();
	
	public UserService() {
		list.add(new User(UUID.randomUUID().toString(), "Durgesh", "durgesh@gmail.com"));
	}
	
	public  List<User> getUsers(){
		return this.list;
	} 

}
