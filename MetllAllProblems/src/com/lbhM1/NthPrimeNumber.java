package com.lbhM1;

public class NthPrimeNumber {
	
	public static int NthPrime(int input1) {
		int count=0, flag=0;
		for(int i=2;i>0; i++) {
			
			flag=0;
			for(int j=2; j<i; j++) {
				if(i%j==0) {
					flag=1;
					break;
				}
			}
			if(flag==0) {
				count++;
			}
			if(count==input1) {
				return i;
			}
		}
		
		return count;
		
	}
public static void main(String[] args) {
	NthPrimeNumber p = new NthPrimeNumber();
	System.out.println(p.NthPrime(2));;
	
}}
