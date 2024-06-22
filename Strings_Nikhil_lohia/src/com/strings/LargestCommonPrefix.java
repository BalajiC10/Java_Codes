package com.strings;

import java.util.Arrays;

public class LargestCommonPrefix {
public static void main(String[] args) {
	
		String str[]= {"club", "clap","clove"};
		
		StringBuilder sb = new StringBuilder();
		
		Arrays.sort(str);
		
		char first []= str[0].toCharArray();
		char second []= str[1].toCharArray();
		char last []= str[str.length-1].toCharArray();
		
		for(int i=0; i<first.length; i++) {
			if(first[i]!=last[i]) {
				break;
				
			}
			sb.append(first[i]);
		}
		System.out.println(sb.toString());
		
}
}
