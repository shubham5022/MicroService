package com.jwt.example.userService;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.jwt.example.model.User;

@Service
public class UserService {

	private List<User> store = new ArrayList<>();

	public UserService() {

		store.add(new User(UUID.randomUUID().toString(), "Shubham", "dhimanshubham020@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Ramesh", "dhimanramesh020@gmail.com"));
		store.add(new User(UUID.randomUUID().toString(), "Sanjana", "dhimansanajana020@gmail.com"));
	
	}
	
	public List<User> getUsers(){
		return this.store;
	}

}
