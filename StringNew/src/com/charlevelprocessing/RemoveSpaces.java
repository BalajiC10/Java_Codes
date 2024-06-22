package com.charlevelprocessing;

public class RemoveSpaces {
public static void main(String[] args) {
	
		String str = "My name";
		String res="";
		for(int i=0; i<str.length(); i++) {
			
			char ch=str.charAt(i);
			
			if(!Character.isWhitespace(ch)) {
				res+=ch;
			}
		}
		
		System.out.println(res);
		
}
}
