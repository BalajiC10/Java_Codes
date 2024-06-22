package com.strings;

public class Demo {
public static void main(String[] args) {
	String str = "helloworld";
	str.toLowerCase();
	int sum=0,sum1=0;
	
	for(int i=0; i<str.length(); i++) {
		
		char ch = str.charAt(i);
		if(ch>='a' && ch<='z') {
			sum+=ch-96;
		}
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			sum1+=ch-96;
		}
		
	}
	System.out.println(sum);
	System.out.println(sum-sum1);
}
}
