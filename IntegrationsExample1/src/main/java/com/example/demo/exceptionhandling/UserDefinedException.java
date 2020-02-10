package com.example.demo.exceptionhandling;

public class UserDefinedException extends RuntimeException {

	public UserDefinedException(int id) {
		// TODO Auto-generated constructor stub

		super("Id ur Searching is not available in database" + id);
	}
}
