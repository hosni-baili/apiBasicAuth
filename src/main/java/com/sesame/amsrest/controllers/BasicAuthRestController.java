package com.sesame.amsrest.controllers;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sesame.amsrest.entities.AuthenticationBean;

@RestController
@CrossOrigin(origins = "*")
public class BasicAuthRestController {
	@GetMapping(path = "/basicauth")
	public AuthenticationBean basicauth() {
		return new AuthenticationBean("You are authenticated");
	}
}
