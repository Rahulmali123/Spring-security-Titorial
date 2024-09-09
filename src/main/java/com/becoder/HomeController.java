package com.becoder;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController 
{
	@GetMapping("/")
	public ResponseEntity<?> getDetails() 
	{
		return new ResponseEntity<>("Hello ,Welcome to Becoder",HttpStatus.OK);
	}
	
	
	
}
