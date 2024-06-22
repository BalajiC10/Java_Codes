package com.problemsolving;

public class CountWords {
public static void main(String[] args) {
	
	String str = "My Name is Balaji";
	int count=1;
	
	
	for(int i=0; i<str.length(); i++) {
		if(str.charAt(i)==' ' && str.charAt(i+1)!=0) {
			count++;
		}	
	}
	
	System.out.println(count);
	
}
}
