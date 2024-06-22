	package com.demo;

public class Demo {
public static void main(String[] args) {
	
	int arr[]= {423,6,7};
	int op =0;
	int rem=0;
	int sum=0;
	int sum1=0;
	
	if(op==2) {
		
		for(int i=0; i<arr.length; i++) {
			rem=arr[i]%10;
			sum=sum+rem; 
			arr[i]/=10; 
			
		}
		sum1+=sum;
		System.out.println(sum1);
	}
	
	int num;
	
	if(op==1 ) {
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i]/=10;
			rem=arr[i]%10;
			if(rem==0 ) {
				rem=1;
			}
			sum=sum+rem;
		}
		sum1=sum1+sum;
		System.out.println(sum);
			
	}
if(op==0) {
		
		for(int i=0; i<arr.length; i++) {
			arr[i]/=100;
			rem=arr[i]%10;
			if(rem==0 ) {
				rem=2;
			}
			
			sum=sum+rem;
		}
		sum1=sum1+sum;
		System.out.println(sum);
			
	}
	
}
}
