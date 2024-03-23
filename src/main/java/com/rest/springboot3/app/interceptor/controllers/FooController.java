package com.rest.springboot3.app.interceptor.controllers;

import java.util.Collections;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/app")
public class FooController {

	@GetMapping("/index")
	public Map<String, String> index(){
		
		return Collections.singletonMap("message", "handler index del controlador");
	}
	
	@GetMapping("/bar")
	public Map<String, String> bar(){
		
		return Collections.singletonMap("message", "handler bar del controlador");
	}
	
	@GetMapping("/foo")
	public Map<String, String> foo(){
		
		return Collections.singletonMap("message", "handler foo del controlador");
	}
}
