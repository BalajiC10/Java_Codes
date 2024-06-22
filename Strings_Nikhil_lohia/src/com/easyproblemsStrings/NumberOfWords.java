package com.easyproblemsStrings;

public class NumberOfWords {
public static void main(String[] args) {
	
	String str = "myNameIsBalaji";
	int count=0;
	
	for(int i=0; i<str.length(); i++) {
		char ch = str.charAt(i);
		
		if(ch>='A' && ch<='Z') {
			count++;
		}
	}
	
	count+=count+1;
	System.out.println(count);
}
}
