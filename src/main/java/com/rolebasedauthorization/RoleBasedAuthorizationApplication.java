package com.rolebasedauthorization;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class RoleBasedAuthorizationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RoleBasedAuthorizationApplication.class, args);
	}

}
