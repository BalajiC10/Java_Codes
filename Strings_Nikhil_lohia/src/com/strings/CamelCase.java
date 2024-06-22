package com.strings;

public class CamelCase {
public static void main(String[] args) {
	String str = "oneTwoThree";
	int count=1;
	
	for(int i=0; i<str.length(); i++) {
		char ch=str.charAt(i);
		
		if(ch>='A' && ch<='Z') {
			count++;
		}
	}
	System.out.println(count);
}
}
