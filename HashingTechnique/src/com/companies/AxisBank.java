package com.companies;
import java.util.*;
public class AxisBank {
public static void main(String[] args) {
		//String str = "cat batman latt matter cat matter cat";
	
		String str = "Bat Cat matter Cat Bat";
		
		Map<String, Integer> map = new HashMap<>();
		String st[]=  str.split(" ");
	
		
		for(int i=0; i<st.length; i++) {
			if(map.containsKey(st[i])) {
				map.put(st[i], map.get(st[i])+1);
			}
			else {
				map.put(st[i], 1);
			}
			
		}
		//System.out.println(map);
		
		for(Map.Entry<String, Integer> mm:map.entrySet()) {
			if(mm.getValue()==2) {
				System.out.println(mm.getKey());
			}
		}
		//OR
		
		List<String> ans = new ArrayList<>();
		
		for(Map.Entry<String, Integer> val:map.entrySet()) {
			if(val.getValue()==2) {
				
				ans.add(val.getKey());
			}
		}
		Collections.sort(ans);
		System.out.println(ans);
}
}
