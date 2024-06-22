package com.searching;

public class LinearSearchInt {
public static void main(String[] args) {
	
		int arr[]= {10,20,30,40,50};
		int srch = 30;
		
		for(int i=0; i<arr.length; i++) {
			if(srch==arr[i]) {
				System.out.println(arr[i]+" present at index "+i);
			}
		}
}
}
