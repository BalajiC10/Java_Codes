package com.see;

public class ShiftFirstAndLastNumInArray {
public static void main(String[] args) {
	//shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
	
	int nums[]={6, 2, 5, 3};
	int arr[]= new int[nums.length];
	for(int i=0; i<arr.length-1; i++) {
		arr[i]=nums[i+1];
	}
	
	arr[arr.length-1]=nums[0];
	
	for(int f:arr) {
		System.out.println(f);
	}
}
}
