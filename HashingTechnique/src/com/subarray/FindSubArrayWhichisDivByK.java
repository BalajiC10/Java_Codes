package com.subarray;
import java.util.*;
public class FindSubArrayWhichisDivByK {
public static void main(String[] args) {
		
//		int arr[]= {23,2,6,4,7};
//		
//		int k=6;
		int arr[]= {23,2,4,6,7};
		
		int k=6;
		List<List<Integer>> ans = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=i; j<=arr.length; j++) {
				int sum=0;
				
				List<Integer> list =new ArrayList<>();
				
				for(int index=i; index<j; index++) {
					sum+=arr[index];
					list.add(arr[index]);
				}
				if(sum%k==0) {
					ans.add(list);
				}
			}
		}
		
		System.out.println(ans);
		
		List<Integer> sb = new ArrayList<>();
		int maxlen=0;
		for(List<Integer> subarray:ans) {
			if( subarray.size()==2) {
				maxlen=subarray.size();
				sb=subarray;
			}
		}
		
		System.out.println(maxlen);
		if(sb.size()==0) {
			System.out.println("false");
		}
		else {
			
			System.out.println(sb);
		}
		
		}
}
