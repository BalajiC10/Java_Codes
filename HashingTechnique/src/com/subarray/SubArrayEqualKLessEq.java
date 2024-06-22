package com.subarray;
import java.util.*;
public class SubArrayEqualKLessEq {
public static void main(String[] args) {
		
		int arr[]= {-3,4,3,-2,2,5};
		int n=6;
		int k=7;
		List<List<Integer>> list = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			
			int sum=0;
			for(int j=0; j<n; j++) {
				List<Integer> subarray = new ArrayList<>();
				
				for(int index=i; index<=j; index++) {
					sum+=arr[index];
					subarray.add(arr[index]);
				}
				if(sum!=0) {
					list.add(subarray);
				}
			}
		}
		System.out.println(list);
}
}
