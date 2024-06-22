package com.hacker;

import java.util.Arrays;

public class FindMedian {
public static void main(String[] args) {
		
		int arr[]= {5,3,1,2,4};
		Arrays.sort(arr);
		int med = arr[0]+arr[arr.length-1]/2;
		System.out.println(med);
		
}
}
