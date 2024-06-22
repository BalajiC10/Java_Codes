package com.arrays;

public class MaxMinArray {
public static void main(String[] args) {
		
		int arr[]= {70,54,78,20,89,67,98};
		
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0; i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
			
		}
		System.out.println("max value is "+max);
		
		for(int i=0; i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
			
		}
		System.out.println("min value is "+min);
}
}
