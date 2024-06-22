package com.charlevelprocessing;

public class PrintOnlyUpperCaseChar {
public static void main(String[] args) {
	
	String st = "My 1name is B2alaji";
	
	int upcount=0,locount=0,dCount=0;
	
	for(int i=0; i<st.length(); i++) {
		char ch = st.charAt(i);
		
		if(Character.isUpperCase(ch)) {
			upcount++;
		}
		else if (Character.isLowerCase(ch)) {
			locount++;
		}
		else if(Character.isDigit(ch)) {
			dCount++;
		}
		
	}
	System.out.println(upcount);
	System.out.println(locount);
	System.out.println(dCount);
}
}
