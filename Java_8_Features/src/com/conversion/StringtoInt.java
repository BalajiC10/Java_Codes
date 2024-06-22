package com.conversion;

public class StringtoInt {
public static void main(String[] args) {
	
	String str = "200";
	int n = Integer.parseInt(str);
	//str.valueOf(n);
	System.out.println(n);
	
	String st = "100";
	int t = Integer.valueOf(st);
	System.out.println(t);
	
}
}
