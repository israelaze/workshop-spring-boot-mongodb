package com.educandoweb.wokshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.educandoweb.wokshopmongo.domain.User;
import com.educandoweb.wokshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired	
	private UserRepository userRepository;;
	
	public List<User> findAll(){
		return userRepository.findAll();
	}

}
