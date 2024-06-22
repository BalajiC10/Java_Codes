package com.demo;

public class StringReverse {
public static void main(String[] args) {
		
		String name ="deepak";
			//  	  012345
		String rev = "";
		
		for(int i=name.length()-1; i>=0; i--) {
			rev+=name.charAt(i);
		}
		System.out.println(rev);
					  
}
}
