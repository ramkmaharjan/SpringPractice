package com.example;

import java.util.ArrayList;
import java.util.List;

public class StringSplit {

	private String[] customSplit(String text) {

		boolean isUSD = false;
		String[] splitString = text.split("\\d+");
		String[] resultArray = null;
		if (splitString.length != 0) {
			List<String> result = new ArrayList<String>();

			if (splitString[0].contains("D")) {
				if (splitString[0].length() != 1) {
					result.add(splitString[0].substring(0, 2));
				}
				isUSD = true;
			} else if(!splitString[0].isEmpty()){
				result.add(splitString[0]);
			}

			if (splitString.length >= 2) {
				int lastIndexChar = splitString.length-1;
				if (isUSD) {
					result.add("D"
							+ text.substring(splitString[0].length(),
									text.lastIndexOf(splitString[lastIndexChar])));
				} else {
					result.add(text.substring(splitString[0].length(),
							text.lastIndexOf(splitString[lastIndexChar])));
				}
				result.add(text.substring(text.lastIndexOf(splitString[lastIndexChar])));
			} else {
				if (isUSD) {
					result.add("D" + text.substring(splitString[0].length()));
				} else {
					result.add(text.substring(splitString[0].length()));
				}
			}

			resultArray = new String[result.size()];
			resultArray = result.toArray(resultArray);

			for (String x1 : resultArray) {
				System.out.println(x1);
			}
		} else {
			resultArray = new String[1];
			resultArray[0] = text;
			System.out.println(resultArray[0]);
		}
		return resultArray;
	}

	public static void main(String[] args) {

		StringSplit x = new StringSplit();
		// x.customSplit("US1234567");
		x.customSplit("US1245666A1");
//		System.out.println("____");
//		x.customSplit("USD1234567A2");
//		System.out.println("____");
	//	x.customSplit("D1234567A2");
	//	System.out.println("____");
		x.customSplit("862A1663A");

	}
}
