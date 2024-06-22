package com.automobiles;

import java.util.Scanner;

import com.automobiles.twowheeler.Hero;

public class Test {
public static void main(String[] args) {
	
	int choice;
	
	Scanner sc = new Scanner(System.in);
	System.out.println("1.Hero");
	System.out.println("2.Honda");
	
	System.out.println("Enter a choice: ");
	choice=sc.nextInt();
	
	switch(choice) {
	case 1:
		Vehicle obj = new Hero();
		Hero obj1 = new Hero();
		obj1.Hero();
		System.out.println(obj.getModelName());
		System.out.println(obj.getRegistrationNumber());
		System.out.println(obj.getOwnerName());
		System.out.println(obj1.getSpeed());
		obj1.radio();
		break;
		
	case 2:
		Vehicle obj3 = new Hero();
		Hero obj4 = new Hero();
		obj4.Hero();
		System.out.println(obj3.getModelName());
		System.out.println(obj3.getRegistrationNumber());
		System.out.println(obj3.getOwnerName());
		System.out.println(obj4.getSpeed());
		obj4.radio();
		break;
		
		default:
			System.out.println("Wrong Choice");
	}
}
}
