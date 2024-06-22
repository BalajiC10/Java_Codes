package com.lbhM1;

public class RecusrionDigitSum {	
	public static int DigitSum(int num) {
		int sum=0;
		int rem=0;
		while(num>0) {
		rem=num%10;
		sum=sum+rem;
		num/=10;
		
		}
		return sum;
		
	}
	public static void main(String[] args) {
		
		int num =DigitSum(12345);
		
		if(num>10) {
			System.out.println(DigitSum(num));
		}
		else{
			System.out.println(num);
		}
		
		
	}
}
