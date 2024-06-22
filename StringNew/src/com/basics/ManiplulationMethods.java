package com.basics;

public class ManiplulationMethods {
public static void main(String[] args) {
	
	String str = "Myname is ";
	System.out.println(str.toUpperCase());
	System.out.println(str.toLowerCase());
	String st = "My name is";
	System.out.println(str.concat(st));
	System.out.println(str.replace("is", "was"));
	String ns = "Chilveri";
	System.out.println(st+" "+ns);
	System.out.println(str.substring(0,2));
	System.out.println(str.equalsIgnoreCase(st));
	
}
}
