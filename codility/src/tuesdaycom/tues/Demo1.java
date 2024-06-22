package tuesdaycom.tues;
import java.util.*;
public class Demo1 {
public static void main(String[] args) {
	int D=4;
	String S = "two";
	
	Map<String, Integer> map = new HashMap<>();
	
    map.put("one",1);
    map.put("two",2);
    map.put("three",3);
    map.put("four",4);
    map.put("five",5);
    
    int res=0;
    System.out.println(D*map.get(S));
    
  }
}
