package com.test;

public class ArraysDemo {
public static void main(String[] args) {
			
	int arr[]= {1,2,3,4,5};
	int brr[]= {6,7,8,9,10};
	
	int ans[]= new int[arr.length*2];
	
	int k=0;
	
	for(int i=0; i<arr.length; i++) {
		ans[k++]=arr[i];
		ans[k++]=brr[i];
	}
	
	for(int i=0; i<ans.length; i++) {
		System.out.println(ans[i]);
	}
	
}
}
