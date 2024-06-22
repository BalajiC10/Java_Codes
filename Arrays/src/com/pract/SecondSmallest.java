package com.pract;

public class SecondSmallest {
public static void main(String[] args) {
	
	int a[]= {5,3,7,23,8,20};
	int temp;
	int k =3;
	for(int i=0; i<a.length; i++) {
		
		for(int j=i+1; j<a.length; j++) {
			if(a[i]>a[j]) {
			temp=a[i];
			a[i]=a[j];
			a[j]=temp;
		}
			
		if(i==k) {
			System.out.print(a[i]);
			break;
		}
	}
		
}
	
}
}
