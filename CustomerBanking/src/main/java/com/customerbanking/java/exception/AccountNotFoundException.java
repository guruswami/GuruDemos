package com.customerbanking.java.exception;

public class AccountNotFoundException extends RuntimeException {

	public AccountNotFoundException(String exception) {
		super(exception);
	}
}
