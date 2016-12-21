package com.adonis.test.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created by seodonghyuk on 2016. 12. 20..
 */
@EnableResourceServer
@ComponentScan({"com.adonis.test.resource.*"})
@SpringBootApplication
public class ResourceApplication {
	public static void main(String[] args) {
		SpringApplication.run(ResourceApplication.class, args);
	}
}