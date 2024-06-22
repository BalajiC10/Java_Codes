package com.sorting;

public class BubbleSort {
public static void main(String[] args) {
	
		int arr[]= {36,19,29,12,5};
		for(int k:arr) {
			System.out.print(k+" ");
		}
		System.out.println();
		int temp;
		for(int i=0; i<arr.length;i++) {
			int flag=0;
			for(int j=0; j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					flag=1;
				}
			}
			if(flag==0) {
				break;
			}
		}
		
		for(int k:arr) {
			System.out.print(k+" ");
		}
}
}
