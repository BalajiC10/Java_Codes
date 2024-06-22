package com.demos;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
public class StreamApi {
public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(37);
		list.add(45);
		
		
		for(int i:list) {
			if(i%2==0) {
			//	System.out.println(i);
			}
		}
		
		List<Integer> evenList= list.stream().filter(i->i%2==0).collect(Collectors.toList());
		//System.out.println(evenList);
		
		//list.forEach(e->System.out.println(e));
		
		Stream<Object> stream = Stream.builder().build();
		stream.forEach(e->System.out.println(e));
		
		IntStream stream1 = Arrays.stream(new int []{2,3,4,5});
		stream1.forEach(e->System.out.println(e));
}
}
