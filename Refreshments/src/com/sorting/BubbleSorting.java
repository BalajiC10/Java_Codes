package com.sorting;

import java.util.Collections;

public class BubbleSorting {
public static void main(String[] args) {
	
		int arr[]= {12,45,23,90,75,10};
		for(int i=0; i<arr.length; i++) {
			int temp=0;
			for(int j=0; j<arr.length-1-i; j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					temp=1;
					
					
				}
			}
			if(temp==0) {
				break;
			}
		}
		
		for(int i:arr) {
			System.out.print(i+" ");
		}
		
}
}
