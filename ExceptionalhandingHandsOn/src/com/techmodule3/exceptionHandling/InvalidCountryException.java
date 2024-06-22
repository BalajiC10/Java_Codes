package com.techmodule3.exceptionHandling;

public class InvalidCountryException extends Exception {
public InvalidCountryException() {
	
	System.out.println("InvalidCountryException occured ");
	System.out.println("User Outside India cannot registered ");
}
}
