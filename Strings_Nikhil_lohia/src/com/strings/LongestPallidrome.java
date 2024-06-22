	package com.strings;

public class LongestPallidrome {
public static void main(String[] args) {
	
	String str = "EBBABAD";
	String res="";
	if(str.length()<=1) {
		System.out.println(res);
	}
	for(int i=1; i<str.length()-1; i++) {
		
		int low=i;
		int high=i;
		
		while(str.charAt(low)==str.charAt(high)) {
			low--;
			high++;
		
			if(low==-1 || high==str.length()) {
				break;
			}
			
	}
		
		String pall = str.substring(low+1, high);
		if(pall.length()>res.length()) {
			res=pall;
		}
		
	
		while(str.charAt(low)==str.charAt(high)) {
			low--;
			high++;
			
			if(low==-1 || high==str.length()) {
				break;
			}
			
		}
		pall=str.substring(low+1,high);
		if(pall.length()>res.length()) {
			res=pall;
		}
		
	}
	System.out.println(res);
	
}
}
