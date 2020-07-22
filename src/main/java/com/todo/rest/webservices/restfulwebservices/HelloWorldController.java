package com.todo.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

// 1st - tell spring this is a controller.
@CrossOrigin(origins = "http://localhost:4200") // allowing specific url request
@RestController
public class HelloWorldController {

	// 2nd - map a get uri of /helloworld to this
	// GET
	// URI - /hello-world
	// method - "hello world"
	@GetMapping(path = "/hello-world")// then define request method inside
	public String helloWorld() {
		return "Hello World";
	}
	
	// Create a get mapping to /hello-world-bean
	@GetMapping(path = "/hello-world-bean")// then define request method inside
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	// Create a get mapping to /hello-world/path-variable/todo
	@GetMapping(path = "/hello-world/path-variable/{name}")// then define request method inside
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}
	
}
