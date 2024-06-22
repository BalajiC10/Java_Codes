package com.demo;

public class PrimeNum {
public static void main(String[] args) {
		
		int num=10;
		int temp=0;
		for(int i=2; i<num-1; i++) {
			if(num%i==0) {
				temp+=1;
			}
		}
		if(temp>0) {
			System.out.println("Not prime num");
		}
		else {
			System.out.println("prime num");
		}
}
}
