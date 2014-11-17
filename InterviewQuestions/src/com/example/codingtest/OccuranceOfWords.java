package com.example.codingtest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class OccuranceOfWords {

	public static void main(String[] args) {
		
		String text = "This is test This is test This is test This is test This is test This is test This is test This is test This test This";
		
		String[] textArray = text.split(" ");
		
		Map<String,Integer> textCount = new HashMap<String,Integer>();
		Set<String> uniqueText = new HashSet<String>();
		for(String s : textArray) {
			if(!uniqueText.add(s)) {
				int count = textCount.get(s);
				textCount.put(s, ++count);
			}else {
				textCount.put(s, 1);
			}
		}
		
		for(Entry<String, Integer> entry : textCount.entrySet()) {
			System.out.println(entry.getKey()+" Has Occurance: " + entry.getValue());
		}
		
		
	}
}
