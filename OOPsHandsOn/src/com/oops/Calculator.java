package com.oops;

public class Calculator {
	
	public static int powerInt(int num1, int num) {
		return (int)Math.pow(num1, num);
	}
	
	public static double powerDouble(double num1, double num2) {
		return num2;
	}
	
	public static void main(String[] args) {
		System.out.println(powerInt(10,2));
		System.out.println(powerDouble(1.5,2));
	} 
	
}
