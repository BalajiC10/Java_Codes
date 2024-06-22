package com.easyproblemsStrings;
import java.util.*;
import java.util.Map.Entry;
public class MissingNumber {
public static void main(String[] args) {
	
		int arr[]= {7,2,5,4,6,3,5,3,1,1};
		int brr[]= {7,2,5,3,5,3,1};
		
		Map<Integer, Integer> ts = new TreeMap<>();
		
		for(int aa:arr) {
			if(ts.containsKey(aa)) {
				ts.put(aa, (ts.get(aa)+1));
			}
			else {
				ts.put(aa, 1);
			}
		}
		System.out.println(ts);
		
		for(int bb:brr) {
			
			int freq= ts.get(bb);
			
			freq--;
			if(freq==0) {
				ts.remove(bb);
			}
			else {
				ts.put(bb, 1);
			}
			
		}
		System.out.println(ts);
		for(Entry<Integer, Integer> ms :ts.entrySet()) {
			System.out.print(ms.getKey()+" ");
		}
}
}
