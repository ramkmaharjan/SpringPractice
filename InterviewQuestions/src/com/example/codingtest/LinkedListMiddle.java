package com.example.codingtest;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> list = new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		list.add("Fifth");
		list.add("Sixth");
		list.add("Seven");
		String midList = findMiddle(list);
		System.out.println(midList);
	}

	private static String findMiddle(LinkedList<String> list) {
		Iterator<String> firstIterator = list.iterator();
		Iterator<String> secondIterator = list.iterator();
		
		while(firstIterator.hasNext()){
			secondIterator.next();  //First
			if(!secondIterator.hasNext()) { //If it doesn't have next , then firstIterator next element would be middle value 
				return firstIterator.next();
			}else {
				secondIterator.next(); // Second
				if(!secondIterator.hasNext()) { // If it doesn't have next , then then firstIterator next element would be middle value
					return firstIterator.next();
				}
			}
			firstIterator.next();
		}
		return "";
	}

}
