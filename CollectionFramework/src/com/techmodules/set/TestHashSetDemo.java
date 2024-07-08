package com.techmodules.set;

public class TestHashSetDemo {
public static void main(String[] args) {
	
	
	HashSetDemo demo = new HashSetDemo();
	demo.addCountry("India");
	demo.addCountry("England");
	demo.addCountry("China");
	demo.addCountry("Shri-lanka");
	
	System.out.println("India: "+ demo.findCountry("India"));
	System.out.println("China: "+ demo.findCountry("China"));
	
}
}
