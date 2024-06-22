package com.companies;

public class IItOnCampus {
public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		int b[]= {5,6,8,8,8};
		
		int n=5;
		int c=1; 
		int d=2;
		int x,y;
		
		int count=0;
		for(int i=0; i<n; i++) {
			
			for(int j=i+1; j<n; j++) {
				
				x = a[i]-a[j]+c;
				y = b[i]-b[j]+d;
				
				if(x==y) {
					System.out.println(x+" "+y);
					count++;
				}
			}
		}
		
		System.out.println(count);
		
}
}
