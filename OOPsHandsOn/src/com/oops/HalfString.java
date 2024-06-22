package com.oops;

public class HalfString {
public static void main(String[] args) {
	
	String name = "Aprn";
	String sub = name.substring(0, name.length()/2);
//	System.out.println(sub);
	if(name.length()%2==0) {
		System.out.println(sub);	
	}
	
	else {
		System.out.println("null");
	}
}
}
