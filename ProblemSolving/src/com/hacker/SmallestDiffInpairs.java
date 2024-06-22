// package com.hacker;
// import java.util.*;
// public class SmallestDiffInpairs {
// public static void main(String[] args) {
// 	Integer arr[]= {1,2,3,4};
// 	List<Integer> list = Arrays.asList(arr);			
// 	Collections.sort(list);
//     Map<Integer,Integer> hmap = new HashMap<>();
//     int mindff = Integer.MAX_VALUE;
    
//     for(int i=0; i<arr.size()-1; i++){
//         int diff = arr.get(i+1)-arr.get(i);
//         hmap.put(i, diff);
//         mindff=Math.min(mindff, diff);
//     }
    
//     List<Integer> list =new ArrayList<>();
//     for(Integer key:hmap.keySet()){
//         if(hmap.get(key)==mindff){
//             list.add(arr.get(key));
//             list.add(arr.get(key+1));
//         }
//     }
//   System.out.println();
	
		
// }
// }
