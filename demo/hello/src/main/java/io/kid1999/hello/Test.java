package io.kid1999.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name){
		return "hello " + name;
	}
}
