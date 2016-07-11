package com.pgs.soft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.pgs.soft.service.impl.UserServiceImpl;



@Controller
@ResponseBody
public class UserController {
	
	@Autowired
	UserServiceImpl userService;
	
	@RequestMapping(value = "/logged", method = RequestMethod.GET)
	String doGet(){
		
		return "You are logged!";
	}
	
}
