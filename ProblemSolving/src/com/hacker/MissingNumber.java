package com.hacker;
import java.util.*;
public class MissingNumber {
public static void main(String[] args) {
		
//		int arr[]= {7,2,5,3,5,3};
//		int brr[]= {7,2,5,4,6,3,5,3};
		
		int arr[]= {203, 204, 205, 206, 207, 208, 203, 204, 205, 206};
		int brr[]= {203, 204, 204, 205, 206, 207, 205, 208, 203, 206, 205, 206, 204};
		
		Map<Integer,Integer> hmap1 = new HashMap<>();
		Map<Integer,Integer> hmap2 = new HashMap<>();
		
		for(int i=0; i<arr.length; i++) {
			if(hmap1.containsKey(arr[i])) {
				hmap1.put(arr[i], hmap1.get(arr[i])+1);
			}
			else {
				hmap1.put(arr[i], 1);
			}
		}
		System.out.println(hmap1);
		
		for(int i=0; i<brr.length; i++) {
			if(hmap2.containsKey(brr[i])) {
				hmap2.put(brr[i], hmap2.get(brr[i])+1);
			}
			else {
				hmap2.put(brr[i], 1);
			}
		}
		System.out.println(hmap2);
		
		List<Integer> list = new ArrayList<>();
		
		for(int element: hmap2.keySet()) {
			if(hmap1.containsKey(element)) {
				if(hmap2.get(element) >hmap1.get(element)) {
					list.add(element);
				}
			}else {
				list.add(element);
			}
		}
		System.out.println(list);
		
}
}
