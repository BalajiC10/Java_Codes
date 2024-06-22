package com.demo;

public class PrimeNumFunc {
	public static boolean isPrime(int num) {
		int no=num;
		int temp=0;
		for(int i=2; i<no-1; i++) {
			if(no%i==0) {
				return false;
				
			}
		}
		//System.out.println("true");
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(PrimeNumFunc.isPrime(7));
	}
}
