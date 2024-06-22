package com.basics;

public class RecFactorial {
	static int fact=1;
public static void main(String[] args) {
	int no=5;
	RecFactorial f = new RecFactorial();
	f.calcFact(no);
	System.out.println("fact of "+no+" is "+fact);
		
}
static void calcFact(int no) {
	if(no>=1) {
		fact =fact*no;
		calcFact(no-1);
	}
}
}
