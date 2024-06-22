package com.pract;
import java.util.*;
import java.util.Map.Entry;
public class MaxOccuranceInArray {
public static void main(String[] args) {
	
	int arr[]= {3,5,3,2,2,1};
	
	Map<Integer , Integer> map = new HashMap<>();
	
	for(int no:arr) {
		
		if(map.containsKey(no)) {
			map.put(no,	(map.get(no)+1) );
		}
		
		else {
			map.put(no, 1);
		}
	}	
	
	int maxfreq =0;
	Set<Map.Entry<Integer, Integer>> es = map.entrySet();
	
	for(Map.Entry<Integer, Integer> me:es) {
		
			maxfreq = Math.max(me.getValue(), maxfreq);
			
	}
	
	System.out.println(maxfreq);
}
}
