package com.todo.rest.webservices.restfulwebservices.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	private static List<Todo> todos = new ArrayList<Todo>();
	private static int idCounter = 0;
	
	static {
		todos.add(new Todo(++idCounter, "ajmk93", "Learn Angular", new Date(), false));
		todos.add(new Todo(++idCounter, "ajmk93", "Learn Microservices", new Date(), false));
		todos.add(new Todo(++idCounter, "ajmk93", "Learn REST API", new Date(), false));
	}
	
	public List<Todo> findAll() {
		return todos;
	}
}
