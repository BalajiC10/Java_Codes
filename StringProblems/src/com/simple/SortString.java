package com.simple;

import java.util.Arrays;

public class SortString {
public static void main(String[] args) {
	
	String str = "dcba";
	char temp;
	char ch[] = str.toCharArray();
	Arrays.sort(ch);
	System.out.println(ch);
	
	for(int i=0; i<ch.length; i++) {
		
		for(int j=i+1; j<ch.length; j++) {
			
			if(ch[i]>ch[j]) {
				
				temp=ch[i];
				ch[i]=ch[j];
				ch[j]=temp;
				
			}
			
		}
		
	}
	
	System.out.println(new String(ch));
}
}
