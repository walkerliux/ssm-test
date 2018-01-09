package com.paytong.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.paytong.service.UserService;

@Controller
public class HelloController {
	@Autowired
	private UserService UserService;
	@RequestMapping("/insertUser")
	public void insertUser(){
		UserService.insertUser();
	}
	@RequestMapping("/selectUser")
	public void selectUser(){
		UserService.selectUser();
	}
}
