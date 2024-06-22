package com.basics;

public class GreaterThree {
public static void main(String[] args) {
	int a=100;
	int b=400;
	int c=3000;
	
	if(a>b && a>c) {
		System.out.println(a+" is greater");
	}
	else if(b>c && b>a) {
		System.out.println(b+" is greater");
	}
	else {
		System.out.println(c+" is greater");
	}
}
}
