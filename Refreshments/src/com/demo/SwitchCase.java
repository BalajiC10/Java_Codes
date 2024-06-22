package com.demo;

public class SwitchCase {
public static void main(String[] args) {
	int a=10;
	int b=20;
	int res;
	String op = "*";

	switch(op) {

	case "-":res=a-b;
	System.out.println(res);
	break;
	case "+":res=a+b;
	System.out.println(res);
	break;
	case "*":res=a*b;
	System.out.println(res);
	break;
	case "/":res=a/b;
	System.out.println(res);
	break;
	default:System.out.println("invalid symbol");

	}
}
}
