package com.test;

public class ReverseEachWord {
public static void main(String[] args) {
		
	String str = "Hello world";
	String sb[]= str.split(" ");
	
	StringBuilder ans = new StringBuilder();
	
	for(int i=0; i<sb.length; i++) {
		
		StringBuilder sb1 = new StringBuilder();
		
		sb1.append(sb[i]);
		sb1.reverse();
		sb1.append(" ");
		ans.append(sb1);
	}
	
	System.out.println(ans);
}
}
