package com.todo.rest.webservices.restfulwebservices.jwt.resource;

import java.io.Serializable;

public class  JwtTokenRequest implements Serializable {
  
  private static final long serialVersionUID = -5616176897013108345L;

  private String username;
    private String password;

//    	{
//    	"token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJpbjI4bWludXRlcyIsImV4cCI6MTU5NjE1MzM4MCwiaWF0IjoxNTk1NTQ4NTgwfQ.UuAGxYfAnFpUBYzH0lXF22GpIQqq1Xr9Gg7vmelpijUKkneXoBaCDqS5WJtRhGbgEuN1v9Eg1yn4iGDBfi8H4Q"
//    	}
    
    public JwtTokenRequest() {
        super();
    }

    public JwtTokenRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

