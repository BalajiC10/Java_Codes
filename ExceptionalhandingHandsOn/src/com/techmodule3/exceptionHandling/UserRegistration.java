package com.techmodule3.exceptionHandling;

import java.util.Scanner;

public class UserRegistration {
public void registerUser(String username, String userCountry) throws InvalidCountryException {
	if(!userCountry.equals("India")) {
		throw new InvalidCountryException();
	}
	else {
		System.out.println("User Registration done succesfully");
		
	}
	
}

public static void main(String[] args) {
	Scanner sc =new Scanner(System.in);
	String name = "", countryName="";
	
	
	System.out.println("Enter the name of user :");
	name = sc.nextLine();
	
	System.out.println("Enter the country name: ");
	countryName = sc.nextLine();
	
	UserRegistration uv = new UserRegistration();
	try {
		uv.registerUser(name, countryName);
	}
	catch(InvalidCountryException e) {
		System.out.println(e.getMessage());
	}

}
}
