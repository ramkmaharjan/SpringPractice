package com.example.hashtable;

import java.util.HashMap;
import java.util.Map;

public class PrintUniqueWord {
	
	public static void main(String[] args) {
		String s ="My name is Ram and My address is Kaloppol";
		String[] words = s.split(" ");
		Map<String, Integer> map = new HashMap<>();
		 Integer n = 0;
	    for (String w : words) {
	         n = map.get(w);
	        n = (n == null) ? 1 : ++n;
	        map.put(w, n);
	    }
	    System.out.println("Count:"+map.size());
	    System.out.println("Maps:"+map.keySet());
	}

}
