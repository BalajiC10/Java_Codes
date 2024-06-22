package com.simple;

public class CaptialFirstChar {
public static void main(String[] args) {
	
		String str[] = {"my", "name", "is" ,"balaji"} ;
		String e="";
		
		for(int i=0; i<str.length;i++) {
			
			char f = str[i].charAt(0);
			f= Character.toUpperCase(f);
			e= f+str[i].substring(1);
			
			System.out.print(e+" ");
		}
}
}
