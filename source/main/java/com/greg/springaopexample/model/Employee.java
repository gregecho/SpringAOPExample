package com.greg.springaopexample.model;

import com.greg.springaopexample.aspect.Loggable;

public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	@Loggable
	public void setName(String nm) {
		this.name = nm;
	}

	public void throwException() {
		throw new RuntimeException("Dummy Exception");
	}
}