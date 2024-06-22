package com.test;

public class Demo2 {
public static void main(String[] args) {
	
		int arr[]= {1,2,3};
		int brr[]= {4,5,6,7,8,9};
		
		int ans[]= new int[arr.length+brr.length];
		int k=0;
		for(int i=0; i<arr.length; i++) {
			ans[k++]=arr[i];
		}
		
		for(int i=0; i<brr.length; i++) {
			ans[k++]=brr[i];
		}
		
}
}
