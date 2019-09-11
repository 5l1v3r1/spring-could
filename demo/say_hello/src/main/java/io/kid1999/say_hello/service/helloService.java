package io.kid1999.say_hello.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("provider-service")
public interface helloService {

	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name);

}
