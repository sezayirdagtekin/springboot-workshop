package com.sezayir.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/world")
	public String sayHello() {
		return " Hello world! ";
	}
	

	@GetMapping("/boot")
	public String sayBoot() {
		return "Hello Springboot";
	}

}
