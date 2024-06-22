package com.test;

import java.util.Arrays;

public class AddcharByTakingDIffOfTwoChar {
public static void main(String[] args) {
		
	
	
	String input1 = "board";
	//bmonaqrnd 
	
	StringBuilder sb = new StringBuilder();
	
	for(int i=0; i<input1.length()-1; i++) {
		char ch = input1.charAt(i);
		char ch1 = input1.charAt(i+1);
		int index1 = ch-96;
		int index2 = ch1-96;
//		System.out.println(index1);
//		System.out.println(index2);
		
		char ch2 = (char)('a'+Math.abs(index1-index2)-1);
		//System.out.println(ch2);
		sb.append(ch);
		sb.append(ch2);
		
	}
	System.out.println(sb.append(input1.charAt(input1.length()-1)));
	
	
		
		
		
		
		
}
}
