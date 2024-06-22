package com.companies;
import java.util.*;

public class amazonOA {
public static void main(String[] args) {
		
//		int loc[]= {1,7,6,8};
//		int mf []= {1,7,2};
//		int mt []= {2,9,5};
	
		int loc[]= {1,5,2,6};
		int mf []= {1,4,5,7};
		int mt []= {4,7,1,3};
		//5,6,8,9
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<loc.length; i++) {
			set.add(loc[i]);
		}
		
		for(int i=0; i<mf.length; i++) {
			if(set.contains(mf[i])) {
				set.remove(mf[i]);
				set.add(mt[i]);
			}
		}
		
		
		System.out.println(set);
		int ans[]= new int[set.size()];
		int j=0;
		for(int i:set) {
			ans[j++]=i;
		}
		
		for(int mm:ans) {
			System.out.println(mm);
		}
		
}
}
