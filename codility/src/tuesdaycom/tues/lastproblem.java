package tuesdaycom.tues;

public class lastproblem {
public static void main(String[] args) {
	String str = "wiprotechnologies";
	StringBuilder ans = new StringBuilder();

	for(int i=0; i<str.length()-1; i++) {
		
		StringBuilder sb = new StringBuilder();
		
		char ch = str.charAt(i);
		char ch1 = str.charAt(i+1);
		char a = (char) ('a'+Math.abs(ch-ch1)-1);
		
		sb.append(ch);
		sb.append(a);
		ans.append(sb);
		
	}
	System.out.println(ans.append(str.charAt(str.length()-1)));
	
	}
}
