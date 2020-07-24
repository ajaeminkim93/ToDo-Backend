package com.todo.rest.basic.auth;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// 1st - tell spring this is a controller.
@CrossOrigin(origins = "http://localhost:4200") // allowing specific url request
@RestController
public class BasicAuthenticationController {


	// Create a get mapping to /hello-world-bean
	@GetMapping(path = "/basicauth")// then define request method inside
	public AuthenticationBean helloWorldBean() {
//		throw new RuntimeException("Some Error has Happened! ");
		return new AuthenticationBean("You are Authenticated");
	}
	

	
}
