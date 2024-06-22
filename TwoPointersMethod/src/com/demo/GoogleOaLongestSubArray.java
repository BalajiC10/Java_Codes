// package com.demo;

// import java.util.ArrayList;
// import java.util.List;

// public class GoogleOaLongestSubArray {

// 	int arr[]= {3,4,5,6,1,2};
// 	int k=3;
	
// 	//[1,2 ]= 2,5
	
// 	//List<List<Integer>> list = new ArrayList<>();
	
// 	for(int i=0; i<arr.length;i++) {
		
// 		for(int j=0; j<arr.length; j++) {
// 			int sum=0;
// 			List<Integer> sub = new ArrayList<>();
// 			List<Integer> idx = new ArrayList<>();
// 			for(int index=i; index<=j; index++) {
// 				sum+=arr[index];
// 				sub.add(arr[index]);
// 				idx.add(index+1);
				
				
// 			}
// 			if(sum<=k ) {
// 				list.add(sub);
				
				
// 			}
// 		}
// 	}
	
	
	
// 	for(List<Integer> mm:list) {
// 		System.out.println(mm);
		
// 	}
	
// 	}
// }
