package com.simple;

public class RemoveSpecialChar {
public static void main(String[] args) {
	
	String str = "b@al#$aj*i";
	
	String org = str.replaceAll("[^a-zA-Z0-9]", "");
	System.out.println(org);
	
}
}
