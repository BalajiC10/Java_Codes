package com.srotingarray;

import java.util.Arrays;

public class BubbleSorting {
public static void main(String[] args) {
	
	int arr[]= {23,53,12,64,87,2};
	

	
	int temp;
	for(int i=0; i<arr.length; i++) {
		int flag=0;
		
		for(int j=0; j<arr.length-1-i; j++) {
			
			if(arr[i]>arr[j+1]) {
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				flag=1;
				}
			if(flag==0) {
				break;
			}
			
		}
			
	}
	for(int n=0; n<arr.length; n++) {
		System.out.print(arr[n]+" ");
	}
	
	
	
	
}
}
