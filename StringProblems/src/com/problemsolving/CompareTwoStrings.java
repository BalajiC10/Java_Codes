package com.problemsolving;

public class CompareTwoStrings {
public static void main(String[] args) {
	
	String s1= "Balaji";
	String s2= "Balaji";
	
	int flag=0;
	for(int i=0; i<s1.length(); i++) {
		for(int j=0; j<s2.length(); j++) {
			
			if(s1.length()==s2.length() && s1.charAt(i)==s2.charAt(j)) {
				flag=1;
			}
			
		}
		
	}
	if(flag==1) {
		System.out.println("it is equal");
	}
	else if(flag==0) {
		System.out.println("it is not equal");
		
	}
	
}
}
