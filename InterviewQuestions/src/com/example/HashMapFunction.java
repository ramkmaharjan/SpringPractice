package com.example;

import java.util.ArrayList;
import java.util.List;

public class HashMapFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1 = new ArrayList<String>();
		list1.add("1");
		list1.add("2");
		List<String> list2 = new ArrayList<String>();
		list2.add("1");
		list2.add("2");
		
		if(list1.equals(list2)) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
		
		System.out.println("Hashcode :List1:" + list1.hashCode());
		System.out.println("Hashcode :List2:" + list2.hashCode());
		
		
		String x =new String("ABC");
		String y =new String("ABC");
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
	}

}
