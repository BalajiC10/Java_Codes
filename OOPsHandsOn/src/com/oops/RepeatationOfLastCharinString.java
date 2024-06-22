package com.oops;

public class RepeatationOfLastCharinString {
public static void main(String[] args) {
	
	String str = "Wipro";
	int pos = 3;
	int len= str.length()-pos;

	String res= str.substring(len).repeat(3);
	System.out.println(res);
	
}
}
