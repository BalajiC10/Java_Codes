package com.series;

public class Demo7 {
public static void main(String[] args) {
	
		double sum=0;
		int x=2;//2-6+18-54
		for(int i=0,k=2; i<20; i++,k*=3) {
			if(i%2==0) {
				sum=sum-k;
			}else {
				sum+=k;
			}
		}
		System.out.println(sum);	
}
}
