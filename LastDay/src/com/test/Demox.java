package com.test;

public class Demox {
public static void main(String[] args) {
		
		String str = "Hi Hell";
		String sb[]= str.split(" ");
		
		StringBuilder ans = new StringBuilder();
		
		for(int i=0; i<sb.length; i++) {
			int len = sb[i].length();
			
			for(int j=0; j<sb[i].length();j++) {
				char ch = sb[i].charAt(j);
				
				ch = (char)(ch+len);
				ans.append(ch);
			}
			ans.append(" ");
	
		}
		 	
		System.out.println(ans);
		
}
}
