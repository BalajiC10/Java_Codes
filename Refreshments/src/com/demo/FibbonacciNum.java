package com.demo;

public class FibbonacciNum {
public static void main(String[] args) {
		
		int num=10;
		int a=0,b=1,c;
		System.out.print(a+ " "+b);
		
		
		for(int i=1; i<=15; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
}
}
