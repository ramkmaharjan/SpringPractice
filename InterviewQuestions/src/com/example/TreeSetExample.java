package com.example;

import java.util.TreeSet;

public class TreeSetExample {

	private String field1;
	
	public TreeSetExample(String field) {
		this.field1 = field;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		System.out.println(field1+":::");
		return super.toString();
	}
	public static void main(String[] args) {
		
		TreeSetExample a = new TreeSetExample("Apple");
		TreeSetExample b = new TreeSetExample("Orange");
		
		TreeSet<TreeSetExample> treeSet = new TreeSet<TreeSetExample>();
		treeSet.add(a);
		treeSet.add(b);
		
	}
}
