package com.example;

public class StringReversal {
	static String reverse = "";
	public static void main(String[] args) {
		String mystring = "Hello this is me";
		
		String reverseS = reverseRecursively(mystring);
		System.out.println(reverseS);

	}

	private static String reverseRecursively(String mystring) {
		
		if(mystring.length() == 1){
			return mystring;
		}else {
			reverse +=mystring.charAt(mystring.length()-1)+reverseRecursively(mystring.substring(0,mystring.length()-1));
			return reverse;
		}
	}

}
