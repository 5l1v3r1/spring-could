package io.kid1999.say_hello.controller;

import io.kid1999.say_hello.service.helloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestFeign {

	@Autowired
	private helloService helloService;

	@GetMapping("/feign/hello/{name}")
	public String test(@PathVariable String name){
		return helloService.hello(name);
	}
}
