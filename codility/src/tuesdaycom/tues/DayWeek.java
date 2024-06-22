package tuesdaycom.tues;

public class DayWeek {
public static void main(String[] args) {
	
	String S ="Sat";
	int K = 2;
	String[] str={"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};
    int std = -1;

    for(int i=0; i<str.length; i++){
    	
        if(str[i].equals(S)){
            std=i;
            break;
        }
        
    }

    int ans = (std+K)%7;
    System.out.println(str[ans]);
}
}
