package com.lbhM1;

public class SecondLastDigit {
public static void main(String[] args) {
	
	int num= 267;
	int num1= 154;//11
	
	
	num=num/10;
	
	int rem = num%10;
	
	num1=num1/10;
	int rem1 = num1%10;
	System.out.println(rem);
	System.out.println(rem1);
	
}
}
