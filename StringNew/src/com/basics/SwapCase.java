package com.basics;

public class SwapCase {
public static void main(String[] args) {
	
	String st= "MY NAME";
	String res="";
	
	for(int i=0; i<st.length(); i++) {
		char ch = st.charAt(i);
		
		if(Character.isUpperCase(ch)) {
			res+=Character.toLowerCase(ch);
		}
		else if(Character.isLowerCase(ch)) {
			res+=Character.toUpperCase(ch);
		}
		else {
			res+=ch;
		}
	}
	System.out.println(res+" ");
}
}
