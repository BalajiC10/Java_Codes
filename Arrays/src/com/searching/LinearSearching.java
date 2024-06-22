package com.searching;

import java.util.Arrays;

public class LinearSearching {
public static void main(String[] args) {
	
	int arr[] = {21,42,75,29,8,32};
	
	int srch = 2;
	
	int temp=0;
	for(int i=0; i<arr.length; i++) {
		if(srch==arr[i]) {
			System.out.println("Elements Present at Position of "+i);
			temp=temp+1;
		}
	}
	if(temp==0) {
		System.out.println("Item Not Found");
	}
	
}
}
