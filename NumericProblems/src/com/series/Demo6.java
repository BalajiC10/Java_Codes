package com.series;

public class Demo6 {
public static void main(String[] args) {
	
		int sum=0;
		for(int i=0, k=10; i<100; i++,k*=10) {
			sum+=k;
		}
		System.out.println(sum);
}
}
