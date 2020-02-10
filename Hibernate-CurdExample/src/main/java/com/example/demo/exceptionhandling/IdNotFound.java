package com.example.demo.exceptionhandling;

public class IdNotFound  extends RuntimeException{

	public IdNotFound(String message) {
		super("The Id ur Searching in Not in Our Db");
		// TODO Auto-generated constructor stub
	}

}
