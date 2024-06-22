package com.array;

public class PrintEvenNum {
public static void main(String[] args) {
	
		int arr[]= {20,36,79,41,67,9,53,56,19,50,46,55};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
}
}
