package com.series;

public class Demo4 {
public static void main(String[] args) {
	
		int sum=0;
		for(int i=2,a=10; i<=10; i+=2,a--) {
			sum+=(double)i/a;
		}
		System.out.println(sum);
}
}
