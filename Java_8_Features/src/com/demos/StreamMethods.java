package com.demos;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamMethods {
public static void main(String[] args) {
			
	List<String> list = List.of("Balaji","Ram","Devansh","Indrajit");
	List<String> names = list.stream().filter(e->e.startsWith("R")).collect(Collectors.toList());
	
	System.out.println(names);
	
	List<Integer> num = List.of(12,4,3,2,14);
	List<Integer> value = num.stream().filter(e->e%2==0).collect(Collectors.toList());
	System.out.println(value);
	
	num.stream().forEach(e->System.out.println(e));
	num.stream().forEach(System.out::println);
	
	num.stream().sorted().forEach(System.out::println);
	Integer st = num.stream().max((x,y) ->x.compareTo(y)).get();
	System.out.println(st);
	
	Integer minv =num.stream().min((x,y)->x.compareTo(y)).get();
	System.out.println();
	
	System.out.println(minv);
}
}
