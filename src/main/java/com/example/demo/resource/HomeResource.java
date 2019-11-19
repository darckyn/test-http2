package com.example.demo.resource;

import javax.annotation.security.PermitAll;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeResource {
	
	@GetMapping
	@PermitAll
	public ResponseEntity<String> hello(HttpServletRequest request) {
		try {
			return ResponseEntity.ok("Hello Word REST ON");
 		} catch (Exception ex) {
			return ResponseEntity.badRequest().build();
		}

	}

}
