package com.sezayir.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.sezayir")
public class SpringbootWebDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootWebDemoApplication.class, args);
	}

}
