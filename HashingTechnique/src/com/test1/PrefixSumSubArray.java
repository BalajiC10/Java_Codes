package com.test1;

public class PrefixSumSubArray {
public static void main(String[] args) {
		
		int arr[]= {2,4,3,1,6,5,7,3,2};
	//			    1,2,3,4,5,6,7,8,9
					
		int q =3;
		int l=5;
		int r = 6; //7
		
//		int sum=0;
//		for(int i=0; i<arr.length; i++) {
//			if(i>=l-1 && i<=r-1) {
//				System.out.println(arr[i]);
//				sum+=arr[i];
//			}
//		}
//		System.out.println(sum);
		
		//using prefix sum arr
		//sum of elements from index 1 to i
		
		
		int prefix[] = new int[arr.length+1];
		//System.out.println(arr.length);
		prefix[0]=0;
		int k=0;
		
		for(int i=1; i<prefix.length; i++) {
			prefix[i]=prefix[i-1]+arr[k++];
			
		}
		
		
		
		//find l and r
		//s(l,r) = prefix[r]-prefix[l-1];
		int sum=0;
		sum+=prefix[r]-prefix[l-1];
		System.out.println(String.format("%d", sum));
		
		
}
}
