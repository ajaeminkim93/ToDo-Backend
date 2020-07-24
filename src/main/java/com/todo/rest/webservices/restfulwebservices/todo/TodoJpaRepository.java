package com.todo.rest.webservices.restfulwebservices.todo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
	
@Repository												// which entity, and what is primary key?
public interface TodoJpaRepository extends JpaRepository<Todo, Long>{

	// create search method, to search for a certain user in the database
	List<Todo> findByUsername(String username);
}
