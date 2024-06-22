package tuesdaycom.tues;
import java.util.*;
public class SumofFirstThreeNum {
public static void main(String[] args) {
		
		int n1 = 10270;
		int n2= 37221;
		int n3 =10270;
		
		String str=""+n1;
		int arr[]= new int[str.length()];
		
		int sum=0;
		int i=0;
		while(n1!=0) {
			int rem = n1%10;
			arr[i++]=rem;
			n1/=10;
		}
		
		Arrays.sort(arr);
		StringBuilder sb = new StringBuilder();
		
		int sum1=0;
		for(int j=0;j<arr.length; j++) {
			sb.append(arr[j]);
			System.out.println(arr[j]);
			if(j==2) {
				break;
			}
		}
		System.out.println(sb);
}
}
