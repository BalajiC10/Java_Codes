package com.basics;

public class FibbonaciRecursion {
	static int a=0,b=1,c;
	public static void main(String args[]) {
		System.out.println();
		FibbonaciRecursion feb= new FibbonaciRecursion();
		feb.printFib(10);
	}
	 void printFib(int i) {
		// TODO Auto-generated method stub
		 if(i>=1) {
			 c=a+b;
			 System.out.print(c+" ");
			 a=b;
			 b=c;
			 printFib(i-1);
		 }
	}
}
