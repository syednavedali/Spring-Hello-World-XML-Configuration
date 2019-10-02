package com.syed.tutorial.bean;

public class GreetService {
	
	private String name;
	
	public String greet() {
		
		if(name!=null && name.isBlank())
			name = "World!";
		
		return "Hello "+name;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
