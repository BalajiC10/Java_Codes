package com.test;
import java.util.*;
public class MissingNumber {
public static void main(String[] args) {
		
	int arr[]= {7,2,5,4,6,3,5,3,1,1};
	int brr[]= {7,2,5,3,5,3,1};
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
				list1.add(arr[i]);
		}
		for(int i=0; i<brr.length; i++) {
			    list2.add(brr[i]);
		}
		
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list1.removeAll(list2));
		System.out.println(list1);
		
		int temp []= new int[list1.size()];
		
		for(int i=0; i<temp.length; i++) {
			temp[i]=list1.get(i);
			System.out.print(temp[i]+" ");
		}
		
		
				
		
}
}
