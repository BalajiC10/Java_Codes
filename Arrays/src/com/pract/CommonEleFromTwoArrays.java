package com.pract;


public class CommonEleFromTwoArrays {
public static void main(String[] args) {
	
	int arr1[]= {4,3,7,9,2};
	int arr2[]= {5,1,7,8,3};
	
	System.out.print("Common Elements: ");
	int temp=0;
	
	for(int i=0; i<arr1.length; i++) {
		
		for(int j=0; j<arr2.length; j++) {
			
			if(arr1[i]==arr2[j]) {
				temp=arr1[i];
			}
		}
	}
	System.out.println(temp);
}
}
