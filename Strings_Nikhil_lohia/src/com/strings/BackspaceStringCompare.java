package com.strings;

public class BackspaceStringCompare {
public static void main(String[] args) {
	
	String str = backString("a#c#");
	String str1 = backString("a#b#");
	System.out.println(str.equals(str1));
	
}

public static String backString(String str) {
	
		StringBuilder sb1 = new StringBuilder();
		
		int hashCount=0;
		
		for(int i=str.length()-1; i>=0; i--) {
			
			if(str.charAt(i)=='#') {
				hashCount++;
				continue;
			}
			
			if(hashCount>0) {
				hashCount--;
			}
			
			else {
				sb1.insert(0, str.charAt(i));
			}
			
		 }
		
		return sb1.toString(); 
	}
}
