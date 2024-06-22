package com.charlevelprocessing;

public class Piglatin {
public static void main(String[] args) {
	
	String str="clear";
	String res="";
	for(int i=0; i<str.length(); i++) {
		char c =str.charAt(i);
		
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
			if(i==0) {
				res=str+"way";
			}
			else {
				res=str.substring(i)+str.substring(0,i)+"ay";
				break;
			}
		}
	}
	System.out.println(res);
}
}
