package com.spring.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.spring.learn.properties.MyAppProperties;

@SpringBootApplication
@ComponentScan(basePackages="com.spring.learn")
public class SpringBasicsApplication {

	public static void main(String[] args) {
		//Enable or disable auto restart
		System.setProperty("spring.devtools.restart.enabled", "true");
		System.out.println("Hello World");

		ConfigurableApplicationContext context=SpringApplication.run(SpringBasicsApplication.class, args);
		MyAppProperties bean = context.getBean(MyAppProperties.class);
		System.out.println(bean.getRefreshTimeUnit());
	}
}
