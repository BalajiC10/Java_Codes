package com.lbhM1;

public class CheckPallidrome {
public static int main(String[] args) {
	
	int input1=123;
	int rem=0, sum=0;
	
	int temp=input1;
	
	while(input1>0) {
		rem=input1%10;
		sum=sum*10+rem;
		input1=input1/10;
	}
	
	if(input1==temp) {
	return 2;
	}
	else {
		return 1;
	}
	
}}
