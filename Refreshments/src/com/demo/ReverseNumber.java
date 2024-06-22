package com.demo;

public class ReverseNumber {
public static void main(String[] args) {
	int num=4321;
	int rev=0,rem;
		while(num!=0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println(rev);
}
}
