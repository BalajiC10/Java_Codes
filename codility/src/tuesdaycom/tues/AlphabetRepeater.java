package tuesdaycom.tues;
import java.util.*;
public class AlphabetRepeater {
public static void main(String[] args) {
		
		String input1="virat";
		input1=input1.toLowerCase();
		int input2=12343;
		
		
		String str= ""+input2;
		int sum=0;
		
		for(int i=0; i<str.length(); i++) {
			int ch = str.charAt(i)-48;
			if(ch!=0) {			
				sum+=ch;
			}
			if(ch==0) {
				break;
			}
		}
		
		int num=0;
		if(sum<9) {
			num = sum;
		}
		else {
			 num = digsum(sum);
		}
		System.out.println(num);
		
		
		if(num%2==0) {
			num=num+1;
		}
		
		if(num%2!=0) {
			num=num-1;
		}
		System.out.println(num);
		
		Map<Character,Integer> map = new HashMap<>();
		for(int i=0; i<input1.length(); i++) {
			char ch = input1.charAt(i);
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		int max=0;
		char ch =' ';
		for(Map.Entry<Character, Integer> hh:map.entrySet()) {
			if(hh.getValue()>max) {
				max= hh.getValue();
			}
			else if(hh.getValue()==1) {
				
			}
		}
		
		List<Character> list = new ArrayList<>();
		if(max==1)
		{
			list.add(input1.charAt(0));
		}
		else {
			
			for(Map.Entry<Character, Integer> hh:map.entrySet()) {
				if(hh.getValue()==max) {
					
					list.add(hh.getKey());
					
				}
				
		}
			
		}
		
		
		System.out.println(list);
		Collections.sort(list);
		Collections.reverse(list);
		System.out.println(list);
		
		StringBuilder sb = new StringBuilder();
		
		for(Character cc:list) {
			sb.append(cc);
		}
		
		
		System.out.println(sb); 
		char c1 =' ';
		for(int i=0; i<sb.length(); i++) {
			c1+=sb.charAt(i);
		}
		System.out.println(c1);
		
	
		String ans = "";
		for(int i=0; i<num; i++) {
			ans+=c1;
		}
		System.out.println(ans);
		
				
}
public static int digsum(int num) {
	int no=num;
	int sum=0;
	while(no!=0) {
		int rem = no%10;
		sum+=rem;
		no/=10;
		
	}
	if(sum<9) {
		return sum;
	}
	else {
		return digsum(sum);
	}
}
}
