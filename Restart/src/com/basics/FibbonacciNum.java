package com.basics;

public class FibbonacciNum {
public static void main(String[] args) {
		
		//it is num which addition of 2 prev nums 0 ,1, 1,2,3,5,8
		int a=0,b=1,c;
		for(int i=0;i<=10;i++) {
			c=a+b;
			System.out.print(c+", ");
			a=b;
			b=c;
				
		}
		
		
}
}
