package com.test1;
import java.util.*;
public class CountPairOfSum {
public static void main(String[] args) {
		
		int arr[]= {5,3,5,7,4,2,4,8,5,10,2};
		int k=12;
		int count=0;
		
		List<List<Integer>> list1 = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			
			List<Integer> list = new ArrayList<Integer>();
			for(int j=i+1; j<arr.length; j++) {
				
				if((arr[i]+arr[j])==k) {
					list.add(arr[i]);
					list.add(arr[j]);
					
					list1.add(list);
					count++;
				}
				
			}
			
		}
		System.out.println(list1);
		
		System.out.println("count: "+count);
		
 }
}
