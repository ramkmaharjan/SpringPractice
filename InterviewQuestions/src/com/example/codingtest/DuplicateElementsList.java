package com.example.codingtest;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElementsList {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		for(int i = 0 ;i < 10;i++) {
			list.add(String.valueOf(i));
		}
		for (int i = 4; i < 8;i++) {
			list.add(String.valueOf(i));
		}
		System.out.println("Original List:" + list);
		
		Set<String> duplicateElements = findDuplicates(list);
		System.out.println("Duplicates:" + duplicateElements);
	}

	private static Set<String> findDuplicates(List<String> list) {
		Set<String> result =new HashSet<String>();
		Set<String> uniqueElements = new HashSet<String>();
		
		for(String s : list) {
			if(!result.add(s)) {
				uniqueElements.add(s);
			}
		}
		return uniqueElements;
	}
}
