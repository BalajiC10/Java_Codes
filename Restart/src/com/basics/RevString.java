package com.basics;

public class RevString {
public static void main(String[] args) {
		
		String name="Deepak";
		int len = name.length();
		System.out.println(len);
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev+=name.charAt(i);
		}
		System.out.println(rev);
}
}
