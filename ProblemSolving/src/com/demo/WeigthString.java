package com.demo;

public class WeigthString {
	public static void main(String[] args) {
		
		String str = "hello world";
		int sum=0;
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)!=' ') {
				sum+=str.charAt(i)-96;
			}
		}
		System.out.println(sum);
	}
}
