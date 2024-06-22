package com.lambda;
public  abstract class Demo implements LambdaDemo, SumIntern, Length{
public static void main(String[] args) {
	
	LambdaDemo i = () -> System.out.println("First time lambda");
	i.play();
	
	SumIntern  s = (a, b)-> a+b;
	System.out.println(s.sum(10,10));
	
	Length f = (str) -> str.length();
	System.out.println(f.getStrlen("Balaji"));
	
	
}

@Override
public void play() {
	System.out.println("Using implement class");

}

@Override
public int sum(int a, int b) {
	// TODO Auto-generated method stub
	System.out.println("Using implement Sum class");
	return 0;
}

@Override
public int getStrlen(String string) {
	// TODO Auto-generated method stub
	return 0;
}

	
	
}
