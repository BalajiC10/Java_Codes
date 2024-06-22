package com.test1;
import java.util.*;
public class MaxDistance {
public static void main(String[] args) {
		///max distance of same occurance num
		int arr[]= {9,3,2,1,3,9};
		//			0,1,2,3,4,5
		int max = 0;
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0; i<arr.length; i++) {
			
			if(map.containsKey(arr[i])) {
				max = Math.max(max, i-map.get(arr[i]));
			}
			else {
				map.put(arr[i], i);
			}
		}
		System.out.println(max);
		
}
}
