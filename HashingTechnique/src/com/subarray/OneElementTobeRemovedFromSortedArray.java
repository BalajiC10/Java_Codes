package com.subarray;
import java.util.*;
public class OneElementTobeRemovedFromSortedArray {
public static void main(String[] args) {
		
		int arr[]= {1,2,1,2};
		
		List<List<Integer>> list = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			for(int j=i; j<arr.length; j++) {
				int sum=0;
				
				List<Integer> sub = new ArrayList<>();
				
				for(int index=i; index<=j; index++) {
					sum+=arr[index];
					sub.add(arr[index]);
				}
				list.add(sub);
			}
		}
		System.out.println(list);
}
}
