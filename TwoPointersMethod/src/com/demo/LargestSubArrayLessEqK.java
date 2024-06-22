package com.demo;
import java.util.*;
public class LargestSubArrayLessEqK {
public static void main(String[] args) {
		
			int arr[]= {8,2,6,2,1,1,4,2};
			int k=10;
			
			List<List<Integer>> list = new ArrayList<>();
			
			List<List<Integer>> indexes = new ArrayList<>();
			
			
			for(int i=0; i<arr.length; i++) {
				for(int j=i; j<arr.length; j++) {
					int sum=0;
					List<Integer> sub = new ArrayList<>();
					List<Integer> indices = new ArrayList<>();
					for(int index=i; index<=j; index++) {
						sum+=arr[index];
						sub.add(arr[index]);
						indices.add(index+1);
					}
					if(sum==k) {
						list.add(sub);
						indexes.add(indices);
					}
				}
				
			}
			//System.out.println(list);
			int max=0;
			List<Integer> longestSubArray = new ArrayList<>();
			
			for(List<Integer> sublist:list) {
				max = Math.max(max, sublist.size());
				longestSubArray=sublist;
					
			}
			List<Integer> longestSubArrayindex = new ArrayList<>();
			for(List<Integer> tt:indexes) {
				max = Math.max(max, tt.size());
				longestSubArrayindex=tt;
					
			}
			System.out.println(longestSubArray);
			System.out.println(longestSubArray.size());
			System.out.println(longestSubArrayindex);
			
}
}
