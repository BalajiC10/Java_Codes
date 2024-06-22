package com.subarray;
import java.util.*;
public class SmallestSubArrayLength {
public static void main(String[] args) {
		int arr[]= {10,5,2,7,1,9,8,7};
		int k=15;
		
		List<List<Integer>> ans = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			List<Integer> tada = new ArrayList<>();
			for(int j=i+1; j<arr.length; j++) {
				if((arr[i]+arr[j])==k) {
					tada.add(arr[i]);
					tada.add(arr[j]);
					ans.add(tada);
				}
			}
		}
		System.out.println(ans);
}
}
