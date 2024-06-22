package com.subarray;
import java.util.*;
public class LongestSubArray {
public static void main(String[] args) {
	
		//longest subarray whos sum is k
		//
		
	    //int arr[]= {10,5,2,7,1,9};
		int arr[]= {1,2,3,4};
		Arrays.sort(arr);
		int k=7;
		
		List<List<Integer>> ans = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i; j<arr.length; j++) {
				int sum=0;
				List<Integer> list = new ArrayList<>();
				
				for(int index=i; index<=j; index++) {
					sum+=arr[index];
					list.add(arr[index]);
					
				}
				if(sum<=k) {
					
					ans.add(list);
				}
			}
				
		}
		int max=0;
		List<Integer> longestSubarray = new ArrayList<>();
		for(List<Integer> sublist:ans) {
			max =Math.max(max, sublist.size());
			longestSubarray = sublist;
		}
		

		System.out.println(longestSubarray);
		System.out.println(max);
	
}
}
