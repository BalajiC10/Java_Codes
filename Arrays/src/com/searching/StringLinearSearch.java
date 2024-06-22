package com.searching;

public class StringLinearSearch {
public static void main(String[] args) {
	
	String str[] = {"Ram", "Sam", "Joe", "Shiva", "Shubham","Rishab"};
	String srch = "Balaji";
	
	int temp=0;
	for(int i=0; i<str.length; i++) {
		
		if(str[i].equals(srch)) {
			System.out.println("Element at index of "+ i);
			temp=temp+1;
		}
		
	}
	
	if(temp==0) {
		System.out.println("String Not Found");
	}
	
}
}
