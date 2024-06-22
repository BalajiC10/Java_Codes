package com.series;

public class GeometricSeries {
public static void main(String[] args) {
	
	//2,4,8,16
	int sum=0;
	for(int i=0,k=2; i<20; i++,k*=2) {
		sum+=k;
	}
	System.out.println(sum);
}
}
