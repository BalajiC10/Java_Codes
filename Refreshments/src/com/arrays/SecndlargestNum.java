package com.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecndlargestNum {
public static void main(String[] args) {
		
		int arr[]= {22,54,12,90,65,78,34};
		List<Integer> list = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			list.add(arr[i]);
		}
		
		System.out.println("Orginal list"+list);
		Collections.sort(list);
		System.out.println("sorted "+list);
		
		System.out.println("sec largest num "+list.get(list.size()-2));
		
		
		int temp;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]<arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
							
				}
			}
		}
		
		System.out.println("sec "+arr[1]);
}
}
