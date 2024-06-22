package com.lbhM1;

public class EvenDigitsSum {
public static void main(String[] args) {
	
	int input1 =1234;
	int rem=0;
	int sum=0;
	
	
	while(input1>0) {
		
		rem=input1%10;
		
		if(rem%2==0) {
			sum=sum+rem;
		}	
		
		input1=input1/10;
		
	}
	System.out.println(sum);
}
}
