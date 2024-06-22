package com.demo;

public class SwapTwoNum {
public static void main(String[] args) {

//		int a=10;
//		int b=20;
//		int t;
//		using third value
//		t=b;
//		b=a;
//		a=t;

	int a = 10;
	int b = 20;

	a = a + b; // a now holds the sum of a and b (10 + 20 = 30)
	b = a - b; // b now holds the new value of a (30 - 20 = 10)
	a = a - b; // a now holds the new value of b (30 - 10 = 20)

	System.out.println("a is "+a); // This will print 20
	System.out.println("b is "+b); // This will print 10


}
}
