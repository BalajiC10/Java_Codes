package com.geeksforgeeks;
import java.util.*;
public class DifferencePair {
public static void main(String[] args) {
		
		int arr[]= {1,2,3,4,5};
		int tar = 7;
		int index= 0;
		
		List<List<Integer>> list = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i+1; j<arr.length; j++) {
				
				List<Integer> pair = new ArrayList<>();
				if((arr[i]+arr[j])==tar) {
					pair.add(arr[i]);
					pair.add(arr[j]);
				
					list.add(pair);				
				}
			}
		}
		System.out.println(index);
		System.out.println(list);
}
}
