package com.spring.learn;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestClientException;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment=SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BasicControllerTest {
	
	@Autowired
	TestRestTemplate templete;
	@Test
	public void getHello() throws RestClientException, MalformedURLException {
		// TODO Auto-generated method stub
		ResponseEntity<String> respone=templete.getForEntity(new URL("http://localhost:4040").toString(), String.class);
		assertEquals(Integer.parseInt(respone.getBody()), 4040);
	}

}
