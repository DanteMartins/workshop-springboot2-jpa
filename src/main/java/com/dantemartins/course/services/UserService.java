package com.dantemartins.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dantemartins.course.entities.User;
import com.dantemartins.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List<User> findAll(){
		return repository.findAll();
	}
	
	public User findById(long Id){
		Optional<User> obj = repository.findById(Id); 
		return obj.get();
	}	

}
