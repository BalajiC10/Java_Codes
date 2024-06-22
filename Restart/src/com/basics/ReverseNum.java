package com.basics;

public class ReverseNum {
public static void main(String[] args) {
	int num=234;
	int rem,rev=0;
	while(num!=0) {
		rem=num%10;
		rev=rev*10+rem;
		num/=10;
	}
	System.out.println(rev);
}
}
