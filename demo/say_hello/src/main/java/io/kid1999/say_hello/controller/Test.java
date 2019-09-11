package io.kid1999.say_hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class Test {

	@Autowired
	private RestTemplate restTemplate;

	@GetMapping("hello/{name}")
	public String say_hello(@PathVariable("name") String name){
		return restTemplate.getForObject("http://provider-service/hello/" + name,String.class);
	}

}
