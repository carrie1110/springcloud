package com.ue.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{
	
	@Value("${config.hello}")
	private String hello;
	
	@RequestMapping("/hello")
	public String from() {
		return this.hello;
	}
}