package com.lbhM1;

public class FibonnaciSeries {
public static void main(String[] args) {
	
	int num =10;
	//0,1,2,3,5,8,13,21
	int a=0;
	int b=1;
	int c=0;
	
	System.out.print(a+" "+b);
	for(int i=2; i<num; i++) {
		c=a+b;
		System.out.print(" "+c);
		a=b;
		b=c;
	}
	
}
}
