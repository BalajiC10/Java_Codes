package com.simple;

public class PallidromeString {
public static void main(String[] args) {
	
	String str = "alaq";
	
	String rev="";
	
	for(int i=str.length()-1; i>=0; i--) {
		rev=rev+str.charAt(i);
		
	}
	if(str.equals(rev)) {
		System.out.println("It is pallidrome");
	}
	else {
		System.out.println("it is not pallidrome");
	}
	
}
}
