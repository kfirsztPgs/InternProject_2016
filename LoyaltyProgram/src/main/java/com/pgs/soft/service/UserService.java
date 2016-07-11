package com.pgs.soft.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.pgs.soft.domain.User;
import com.pgs.soft.dto.UserDTO;

@Service
public interface UserService {

	public Optional<User> getUserByEmail(String email);
	
	public void register(UserDTO userDTO);
}
