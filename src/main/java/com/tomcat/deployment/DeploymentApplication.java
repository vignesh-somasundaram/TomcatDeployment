package com.tomcat.deployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DeploymentApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(DeploymentApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(DeploymentApplication.class, args);
	}

	@RequestMapping("/home")
	public String hello(){
		return "Hello there from Vignesh";
	}
}
