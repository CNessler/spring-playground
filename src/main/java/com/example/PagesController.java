package com.example;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class PagesController {
	
	@GetMapping("/math/pi")
	public String helloWorld() {

		return "3.14159";
	}
	
}
