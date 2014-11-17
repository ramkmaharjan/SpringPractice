package com.example.codingtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class HashMapToArrayList {

	public static void main(String[] args) {
		HashMap<String,String> hashMapList = new HashMap<String,String>();
		hashMapList.put("key1","value1");
		hashMapList.put("key2","value2");
		hashMapList.put("key3","value3");
		hashMapList.put("key4","value4");
		hashMapList.put("key5","value5");
		
		//
		List<Entry> list = new ArrayList<Entry>(hashMapList.entrySet());
		
		System.out.println(list);
		
	}
}
