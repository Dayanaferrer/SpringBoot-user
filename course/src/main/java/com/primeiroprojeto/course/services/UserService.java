package com.primeiroprojeto.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.primeiroprojeto.course.entities.User;
import com.primeiroprojeto.course.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public List <User> findAll (){
		return repository.findAll();		
	}
	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.get();
		
	}

}