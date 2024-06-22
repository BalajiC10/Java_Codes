package com.demo;

public class Demo1 {
public static void main(String[] args) {
		int arr[]= {3,5,6};
		int arr1[]= {2,2,3};
		
		int min=arr[0];
		for(int i=0; i<arr.length;i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		
		int count = 0;
		for(int i=0; i<arr.length; i++) {
			while(arr[i]!=min) {
				if(min!=arr[i]) {
					arr[i]--;
				}
				
				count++;
			}
		}
		
		System.out.println(count);
}
}
