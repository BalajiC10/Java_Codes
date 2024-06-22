package com.lbhM1;

public class NthFibbonaci {
public  static void main(String[] args) {
		int arr[]= new int[50];
		int input1 = 2;
		
		int a=0,b=1,c;
		for(int i=1; i<50; i++) {
			c=a+b;
			
			arr[i]=c;
			a=b;
			b=c;
					
		}
		for(int i:arr) {
			System.out.println(i);
		}
		
}
}
