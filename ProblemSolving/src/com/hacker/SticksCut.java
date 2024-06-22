package com.hacker;
import java.util.*;
public class SticksCut {
public static void main(String[] args) {
		
		int arr[]= {1,2,3};
		int min=arr[0];
		int tsticks=arr.length;
		int rsticks = 0;
//		sticks-length        length-of-cut   sticks-cut
//		5 4 4 2 2 8             2               6
//		3 2 2 _ _ 6             2               4
//		1 _ _ _ _ 4             1               2
//		_ _ _ _ _ 3             3               1
//		_ _ _ _ _ _           DONE            DONE
		Arrays.sort(arr);
	
		while(rsticks!=tsticks) {
			int val = arr[0];
		}

		
		
}
}
