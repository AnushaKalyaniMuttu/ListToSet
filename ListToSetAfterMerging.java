package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListToSetAfterMerging {
	public static void main (String [] args) {
		List<Integer> list1=new ArrayList<>();
		 list1.add(1);
	    list1.add(2);
	    list1.add(3);
		List<Integer> list2=new ArrayList<>();
		list2.add(4);
		list2.add(1);
		
		list1.addAll(list2);
		
		list1.forEach(System.out::println);
		
		
		list1.stream().collect(Collectors.toSet()).forEach(System.out::println);
	}
	

}
