package com.test;
import java.util.*;
public class FirstLastIndex {
public static void main(String[] args) {
			
		int arr[]= {5,7,7,78,10,7,12,7,62,2,7};
		int tar= 7;
		List<Integer> ind = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			if(tar==arr[i]) {
				System.out.println("index "+i);
				ind.add(i);
			}
		}
		
		System.out.println(ind);
		System.out.println((ind.get(ind.size()-1))-ind.get(0));
		}
}
