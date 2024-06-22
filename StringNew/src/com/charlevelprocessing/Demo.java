package com.charlevelprocessing;

public class Demo {
public static void main(String[] args) {
	
	String st="This is String";
	
	for(int i=0; i<st.length(); i++) {
		
		char ch = st.charAt(i);
		if(ch!=32) {
			System.out.println(ch+" "+(int)ch);
		}
	}
}
}
