package com.pgs.soft.service;

import java.util.Optional;

import com.pgs.soft.domain.User;

public interface UserService {
	
	public Optional<User> getUserByEmail(String email);
		
}
