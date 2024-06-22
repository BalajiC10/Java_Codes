package com.basics;

import java.util.Scanner;

public class UserInput {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the name: ");
	String name = sc.next();
	System.out.println("Enter the age: ");
	int age = sc.nextInt();
	System.out.println("Enter the Gender: ");
	char Gender = sc.next().charAt(0);
	sc.close();
	System.out.println("Good Morning "+name+ "your age is "+age+" and gender is "+Gender);
	
}
}
