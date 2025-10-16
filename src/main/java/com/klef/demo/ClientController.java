package com.klef.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController

public class ClientController {
	@GetMapping("/")
	public String Home() {
		return "Home" ;
	}
	
	@GetMapping("/Login")
	public String Login() {
		return "Login" ;
	}
	
	@GetMapping("/Demo")
	public String Demo() {
		return "Demo" ;
	}
	
	@GetMapping("/Admin")
	public String Admin() {
		return "Admin" ;
	}
	

}