package com.example.singleton;

public class SingletonClass {

	private static SingletonClass instance = new SingletonClass();
	private SingletonClass() {
		
		
	}
	private static SingletonClass getInstance() {
		return instance;
	}
}
