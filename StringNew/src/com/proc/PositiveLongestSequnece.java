package com.proc;

public class PositiveLongestSequnece {
public static void main(String[] args) {
	
		int arr[] = {1,2,3,-6,-4,-5,10,20,30,40,59};
		int numOfSeq=0;
		int currlen=0;
		int maxlen=0;
		int end=0,start=0;
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>0) {
				currlen++;
			}
			if(currlen>maxlen) {
				maxlen=currlen;
				end=i;
				
				start = end-maxlen+1;
		}
			
		else{
				currlen=0;
			}
		}
		System.out.println(start);
		System.out.println(end);
		int sum=0;
		for(int i=start; i<=end; i++) {
			
			sum+=arr[i];
		}
		System.out.println("Longest Positive sequence sum: "+sum);
}
}
