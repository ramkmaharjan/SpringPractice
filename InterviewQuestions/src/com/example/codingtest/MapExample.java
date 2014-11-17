package com.example.codingtest;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> example = new HashMap<String,String>();
		example.put("key1", "value1");
		example.put("key2", "value2");
		example.put("key3", "value3");
		example.put("key4", "value4");
		example.put("key5", "value5");
		
		
		Set<Entry<String, String>> s = example.entrySet();
		
		for(Map.Entry<String,String> x : s) {
			System.out.println(x.getValue());
		}
		
		for(String x : example.keySet()) {
			System.out.println(x);
		}
		
		
		
	}   
}
