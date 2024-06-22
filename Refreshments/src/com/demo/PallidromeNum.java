package com.demo;

public class PallidromeNum {
public static void main(String[] args) {
		
		int num=121;
		
		int temp=num;
		
		int rev=0,rem;
		while(temp!=0) {
			rem= temp%10;
			rev=rev*10+rem;
			temp/=10;
		}
		
		if(rev==num) {
			System.out.println(num+" is "+"Pallidrome");
		}
		else {
			System.out.println(num+" is Not Pallidrome");
		}
}
}
