package com.srotingarray;

import java.util.Arrays;

public class SelectionSorting {
public static void main(String[] args) {
	
	int a[] = {23,53,12,64,87,2};
	System.out.println(Arrays.binarySearch(a, 87));
	
	int temp=0;
	int min;
		for(int i=0; i<a.length;i++) {
			min=i;
			
			for(int j=i+1; j<a.length; j++) {
				
				if(a[j]<a[min]) {
					min=j;
				}
			}
			temp=a[i];
			a[i]=a[min];
			a[min]=temp;
			
		}
		for(int k=0; k<a.length; k++) {
			System.out.print(a[k]+" ");
		}
	
}
}
