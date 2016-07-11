package com.pgs.soft.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	String doGet(HttpServletRequest httpServletRequest){
		
		HttpSession session = httpServletRequest.getSession();
		
		
		
		return "You are logged!  Email: " + session.getAttribute("email") + "   Authorities: " + session.getAttribute("authorities");
	}
	
	@RequestMapping(value = "/loggedout", method = RequestMethod.GET)
	String doGet2(HttpServletRequest httpServletRequest){
		
		HttpSession session = httpServletRequest.getSession();
			
		
		return "You are logged out!  Email: " + session.getAttribute("email") + "   Authorities: " + session.getAttribute("authorities");
	}
	
}
