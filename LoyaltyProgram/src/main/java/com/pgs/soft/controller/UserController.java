package com.pgs.soft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pgs.soft.service.UserService;



@Controller
public class UserController {
	
	@Autowired
	UserService userService;
	

}