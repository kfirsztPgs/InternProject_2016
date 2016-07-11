package com.pgs.soft.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pgs.soft.domain.User;
import com.pgs.soft.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	Optional<User> getUserByEmail(String email){
					
		return userRepository.findOneByEmail(email);
	}
	

}
