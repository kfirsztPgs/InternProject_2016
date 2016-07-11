package com.pgs.soft.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.pgs.soft.domain.User;
import com.pgs.soft.dto.UserDTO;
import com.pgs.soft.repository.UserRepository;
import com.pgs.soft.service.UserService;

@Service
public class UserServiceImpl implements UserService, UserDetailsService {

	UserRepository userRepository;
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository){
		this.userRepository = userRepository;
	}
	
	@Override
	public void register(UserDTO userDTO) {
		User user = new User();
		user.setEmail(userDTO.getEmail());
		//user.setPasswordHashed(userDTO.getPassword());
		user.setPasswordHashed(new BCryptPasswordEncoder().encode(userDTO.getPassword()));
		userRepository.save(user);
	}

	@Override
	public Optional<User> getUserByEmail(String email) {
		return userRepository.findOneByEmail(email);
	}

	@Override
	public UserDetails loadUserByUsername(String arg0) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

}
