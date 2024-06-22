package com.oops;

public class StringPallidrome {
public static void main(String[] args) {
	
	String name = "tat";
	
	String rev="";
	
	for(int i=name.length()-1; i>=0; i--) {
		rev=rev+name.charAt(i);
		
	}
	if(name.equals(rev)) {
		System.out.println("It is pallidrome");
	}
	else {
		System.out.println("it is not pallidrome");
	}
}
}
