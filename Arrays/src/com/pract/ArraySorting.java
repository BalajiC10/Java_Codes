package com.pract;

import java.util.Arrays;

public class ArraySorting {
public static void main(String[] args) {
	
	int arr[ ]= {2,11,54,67,12,90,1};
	int temp;
	
	for(int i=0; i<arr.length; i++) {
		
		for(int j=i+1; j<arr.length; j++) {
			
			if(arr[i]>arr[j]) {
				
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			
			}
		}
		
	}
	
	System.out.println(Arrays.toString(arr));
}
}
