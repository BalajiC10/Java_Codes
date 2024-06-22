package com.array;

public class PrintOddNum {
public static void main(String[] args) {
	
		int arr[]= {10,23,53,90,45,20,34,1,5,7,47};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}
		
}
}
