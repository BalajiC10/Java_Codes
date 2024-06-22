package com.searching;

import java.util.Arrays;

public class BinarySearch {
public static void main(String[] args) {
	
	int arr[]= {23,13,53,87,12,6,2,9,18,86};
	Arrays.sort(arr);
	for(int cd:arr) {
		System.out.print(cd+" ");
	}
	//          li          mi           hi
	System.out.println();
	int item = 13;
	int li=0;
	int hi=arr.length-1;
	int mi=(li+hi)/2;
	
	while(li<=hi) {
			
		if(arr[mi]==item) {
			System.out.println("Element at Index Position of "+mi+" index position");
			break;
		}
		else if(arr[mi]<item) {
			li=mi+1;
		}
		else {
			hi=mi-1;
		}
		mi=(li+hi)/2;
	}
	if(li>hi) {
		System.out.println("Element not Found");
	}
}
}
