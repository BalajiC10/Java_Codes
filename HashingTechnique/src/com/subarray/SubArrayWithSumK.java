package com.subarray;
import java.util.*;
public class SubArrayWithSumK {
public static void main(String[] args) {
		
		int arr []= {2,4,-3,2,5,-1,2};
			//		 0,1,2,3,4,5,6,7
		int k=3;
		
		int count=0;
		List<List<Integer>> list = new ArrayList<>();
		List<List<Integer>> idx = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i; j<arr.length; j++) {
				int sum=0;
				List<Integer> subarray = new ArrayList<>();
		
				for(int index=i; index<=j; index++) {
					sum+=arr[index];
					subarray.add(arr[index]);
				}
				
				
				if(sum==k) {
					
						list.add(subarray);
					count++;
				}
				
			}
		}
		System.out.println(list);
		System.out.println(count);
		
		
}
}
