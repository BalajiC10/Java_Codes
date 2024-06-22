package com.geeksforgeeks;

import java.util.*;
public class MapFreq {
public static void main(String[] args) {
	
	int arr[]= {1,2,3,5,2,6,8,9};
	
	String str = "12352689";
	
	Map<Integer,Integer> map = new HashMap<>();
	
	for(int i=0; i<arr.length; i++) {
		
		if(map.containsKey(arr[i])) {
			map.put(arr[i], map.get(arr[i])+1);
		}
		else {
			map.put(arr[i], 1);
		}
	}
	
	System.out.println(map);
	
	
	int count[]= new int[10];
	
	for(int i=0; i<str.length(); i++) {
		count[str.charAt(i)-48]++;
	}
	
	for(int i=0; i<count.length; i++) {
		System.out.print(count[i]);
		
	}
}
}
