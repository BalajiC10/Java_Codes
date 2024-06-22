package com.demo;
import java.util.*;
public class TwoSum {
public static void main(String[] args) {
		
		int arr[]= {5,7,2,8,9,1};
		int k=9;
		List<List<Integer>> list = new ArrayList<>();
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i; j<arr.length; j++) {
				
				int sum=0;
				List<Integer> sub = new ArrayList<>();
				
				for(int index=i; index<=j; index++)
				{
					sum+=arr[index];
					sub.add(arr[index]);
					
				}
				//System.out.println(sub);
				if(sum==k) {
					list.add(sub);
				}
				}
		}
		System.out.println(list);
		int sublist=0;
		int min=2;
		for(List<Integer> m:list) {
			if(min==m.size()) {
			//	System.out.println(m);
				
				System.out.println(m);
		}
		//	System.out.println(Arrays.binarySearch(arr, m));
			
		}
		
}
}

