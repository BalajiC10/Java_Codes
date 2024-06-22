package com.letsee;

public class Demo1 {
public static void main(String[] args) {
		
	String str = "A";
	int sum=0;
	
	for(int i=0; i<str.length(); i++) {
		sum+=str.charAt(i);
	}
	
	System.out.println(sum);
}
}
