package com.subarray;
import java.util.*;
public class subArrayProblem {
public static void main(String[] args) {
		
		int arr[]= {23,2,4,6,4,7};
		
		int k=6;
		
		List<List<Integer>> list = new ArrayList<>();
		
		
		for(int i=0;i<arr.length; i++) {
			
			for(int j=i;j<arr.length; j++) {
				int sum=0;
				List<Integer> subarray = new ArrayList<>();
				
				for(int index=i; index<=j; index++) {
					sum+=arr[index];
					subarray.add(arr[index]);
					
				}
				if(sum==k) {
					list.add(subarray);
				}
			}
		}
		System.out.println(list);
}
}
