package com.example.codingtest;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		
		System.out.print("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		int reverse = 0 ;
		int remainder;
		
		while(number != 0){
			remainder = number%10;
			reverse = reverse*10+remainder;
			number = number /10;
		}
		
		System.out.println("The reverse of number is " + reverse);
		
	}

}
