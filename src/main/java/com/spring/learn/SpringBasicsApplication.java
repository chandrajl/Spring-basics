package com.spring.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.spring.learn")
public class SpringBasicsApplication {

	public static void main(String[] args) {
		//Enable or disable auto restart
		System.setProperty("spring.devtools.restart.enabled", "true");
		System.out.println("Hello World");
		
		SpringApplication.run(SpringBasicsApplication.class, args);
	}
}
