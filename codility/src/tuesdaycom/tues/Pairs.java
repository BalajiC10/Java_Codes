package tuesdaycom.tues;
import java.util.*;
public class Pairs {
public static void main(String[] args) {
		int arr[]= {1,3,2,6,1,2};
		
		List<List<Integer>> list = new ArrayList<>();
		int k=3;
		int count=0;
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				List<Integer> sub = new ArrayList<>();
				
				if(arr[i]+arr[j]%k==k) {
					
					sub.add(arr[i]);
					sub.add(arr[j]);
					list.add(sub);
					
				}
			}
			
		}
		System.out.println(list);
}
}
