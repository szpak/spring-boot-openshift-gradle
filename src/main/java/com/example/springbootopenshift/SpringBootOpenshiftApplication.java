package com.example.springbootopenshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootOpenshiftApplication {

	@RequestMapping("/")
	public String home() {
		return "Hello Openshift World";
        }

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOpenshiftApplication.class, args);
	}
}
