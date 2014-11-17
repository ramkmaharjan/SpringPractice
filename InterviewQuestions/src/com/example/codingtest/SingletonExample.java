package com.example.codingtest;

public class SingletonExample {

	private static SingletonExample singleInstance;
	
	private String name;
	private SingletonExample() {
		
	}
	
	private static SingletonExample getInstance(){
		if(singleInstance== null) {
			singleInstance = new SingletonExample();
		}
		return singleInstance;
	}
	
	private void setName(String name){
		this.name = name;
		
	}
	private void display() {
		System.out.println("Name is:"+ name);
	}
	
	public static void main(String[] args) {
		SingletonExample ex = SingletonExample.getInstance();
		ex.setName("Nepal");
		SingletonExample ex2 = SingletonExample.getInstance();
		ex2.display();
	}
}
