package com.test1;

public class AbsoluteDIffOfK {
public static void main(String[] args) {
		
		int arr[]= {1,2,2,1};
		int k=1;
		int count=0;
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				if(Math.abs(arr[i]-arr[j])==k) {
					count++;
				}
			}
		}
		System.out.println(count);
}
}
