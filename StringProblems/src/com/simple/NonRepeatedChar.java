package com.simple;

public class NonRepeatedChar {
public static void main(String[] args) {
	
	
	String str = "Balaji";
	
	for(int i=0; i<str.length(); i++) {
		
		boolean un=true;
		
		for(int j=i; j<str.length(); j++) {
			
			if(i!=j && str.charAt(i)==str.charAt(j)) {
					un=false;
			}
		}
		
		if(un==true) {
			System.out.println("First not repeated char: "+str.charAt(i));
			break;
		}
		
	}
}
}
