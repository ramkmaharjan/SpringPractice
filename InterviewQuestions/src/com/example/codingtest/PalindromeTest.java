package com.example.codingtest;

import java.util.Scanner;

public class PalindromeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String text = sc.next();
		
		int startIndex = 0;
		int endIndex = text.length()-1;
		
		boolean isPalindrome = true;
		
		while(startIndex < endIndex) {
			char startLetter = text.charAt(startIndex);
			char endLetter = text.charAt(endIndex);
			if(startLetter != endLetter) {
				isPalindrome = false;
				break;
			}
			startIndex++;
			endIndex--;
		}
		
		if(isPalindrome) {
			System.out.println("Text:"+ text +" is Palindrome number");
		}else {
			System.out.println("Text:"+ text +" is not a Palindrome number");
		}
	}

}
