package com.pract;

public class FindKthLargestSmallest {
public static void main(String[] args) {
	
	int a[]= {5,8,12,7,6,2,4};
	int temp;
	int k=2;
	
	for(int i=0; i<a.length; i++) {
		
		for(int j=i+1; j<a.length; j++) {
			
			if(a[i]<a[j]) {
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}	
			
	}
		if(i==k-1) {
			System.out.print(a[i]);
			break;
		}
		
	}
}
}
