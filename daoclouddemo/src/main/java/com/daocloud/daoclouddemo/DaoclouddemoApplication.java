package com.daocloud.daoclouddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DaoclouddemoApplication {

	@RequestMapping("/say")
	public String say(){
		return "Hello DaoCloud！";
	}


	public static void main(String[] args) {
		SpringApplication.run(DaoclouddemoApplication.class, args);
	}
}
