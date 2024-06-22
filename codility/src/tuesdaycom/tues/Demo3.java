package tuesdaycom.tues;

public class Demo3 {
	public String solution(int N) {
    // Implement your solution here
	
    String res= "";
    for(int i=1; i<=N; i++){
        if(i%2!=0) {
            res+="+";
        }else{

            res+="-";
        }
    }
    return res;
}
	public static void main(String[] args) {
		
	
	    
	}
}
