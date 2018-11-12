package com.spring.learn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/basics")
public class BasicsController{

	@RequestMapping("/");
	public String sayHello(){
		return "Hello from SpringBoot";
	}
}
