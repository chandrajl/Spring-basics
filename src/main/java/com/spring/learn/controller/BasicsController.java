package com.spring.learn.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicsController{

	
	@Value("${server.port}")
	int port;
	
	@RequestMapping("/")
	public int sayHello(){
		return port;
	}
}
