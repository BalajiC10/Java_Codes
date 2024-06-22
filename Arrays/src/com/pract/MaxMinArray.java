package com.pract;

public class MaxMinArray {
public static void main(String[] args) {
	
	int arr[]= {2,3,5,7,8};
	int max=arr[0];
	int min=arr[0];
	for(int i=0; i<arr.length; i++) {
		if(max<arr[i])
		max=arr[i];
		
		else {
			min=arr[i];
		}
	}
	System.out.println("max: "+max);
	System.out.println("min: "+min);
	System.out.println();
	
	for(int cd:arr) {
		System.out.print(cd+" ");
	}
}
}
