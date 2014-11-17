package com.example.codingtest;

import java.util.Scanner;

public class FibonacciWithoutArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first = 0;
		int second = 1;
		int next;
		
		System.out.print("Please enter the terms for Fibonacci Series:");
		Scanner sc = new Scanner(System.in);
		
		int numberOfCount = sc.nextInt();
		
		sc.close();
		
		System.out.print(first + " " + second);
		for(int index = 3; index < numberOfCount;index++) {
			next = first + second;
			first = second;
			second = next;
			
			System.out.print(" " +next);
		}
	}

}
