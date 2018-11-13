package com.spring.learn.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

	@Value("${server.port}")
	public	int port;
}
