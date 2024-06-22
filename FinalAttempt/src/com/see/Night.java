package com.see;

import java.util.HashMap;
import java.util.Map;

public class Night {
public static void main(String[] args) {
		int arr[]= {10 ,20, 20, 10, 10, 30, 50, 10, 20}; 
		int count=0;
		
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0; i<arr.length; i++){
            if(map.containsKey(arr[i])){   
                map.put(arr[i], map.get(arr[i])+1);
            }
            else {
            	map.put(arr[i], 1);
            }
        }
        
        for(Map.Entry<Integer,Integer> mp :map.entrySet() ){
            if(mp.getValue()%2!=0){
                count++;
            }
        }
       System.out.println(count);
}
}
