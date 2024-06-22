package com.basics;

public class PallidromeNum {
public static void main(String[] args) {
		
			//which is equal even if it is same 121
		
			int num=1211;
			int temp=num; 
			int rev=0,rem;
			
			while(temp!=0) {
				rem=temp%10;
				rev=rev*10+rem;
				temp/=10;
			}
			System.out.println(rev);
			
			if(rev==num) {
				System.out.println("pallidrome");
			}
			else {
				System.out.println("not pallidrome");
			}
}
}
