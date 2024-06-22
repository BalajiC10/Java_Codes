package com.basics;

public class CheckPrime {
public static void main(String[] args) {
		//a prime num called which is divided by 1 and itself for e.g - 1,3,5
		int no=8;
		int temp=0;
		for(int i=2; i<no-1; i++) {
			if(no%i==0) {
				temp+=1;
			}
		}
		if(temp>0) {
			System.out.println("Not prime");
		}
		else {
			System.out.println("It is prime");
		}
}
}
