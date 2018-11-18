package com.spring.learn.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicsController{

	Logger logger = LoggerFactory.getLogger(BasicsController.class);

	@Value("${server.port}")
	int port;

	@RequestMapping("/")
	public String sayHello(){
		logger.trace(String.valueOf(port));
		logger.debug(String.valueOf(port));
		logger.info(String.valueOf(port));
		logger.warn(String.valueOf(port));
		logger.error(String.valueOf(port));
		return String.valueOf(port);
	}
}
