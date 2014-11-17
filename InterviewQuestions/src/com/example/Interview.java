package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;

public class Interview {

	private List<String> nameList;

	private Map<String, GregorianCalendar> hashMapValue;

	public Interview() {

		nameList = new ArrayList<String>();
		nameList.add("MARY");
		nameList.add("JOE");
		nameList.add("SIENNA");
		nameList.add("PETER");
		
		
	}

	private void iterateProcess() {

		ListIterator<String> listIterator = nameList.listIterator();
		/*
		 * Creating Copy Array because we can't modify list while it is being
		 * iterated. If we try so, ConcurrentModify Exception is thrown.
		 */
		String[] copyArray = new String[nameList.size()];
		int index = 0;

		/* Initialization only when it is needed */
		hashMapValue = new HashMap<String, GregorianCalendar>();

		while (listIterator.hasNext()) {
			String element = listIterator.next();
			element = element.substring(0, 1)
					+ element.substring(1).toLowerCase();
			copyArray[index++] = element;

			/*
			 * Date methods are deprecated so, Instead GregorianCalendar class
			 * is used
			 */
			GregorianCalendar gcalendar = new GregorianCalendar(
					1990 - element.length(), 3, 6); // Month starts with 0, so 3
													// means April, Days start
													// with 1, so 30 means 6th
													// day.

			hashMapValue.put(element, gcalendar);

		}
		/* Re-assigning the same list with new Value */
		nameList = Arrays.asList(copyArray);
	}

	private void displayName() {

		Iterator<String> keyIterator = hashMapValue.keySet().iterator();

		while (keyIterator.hasNext()) {
			String key = keyIterator.next();
			GregorianCalendar dateValue = hashMapValue.get(key);

			int age = calculateAge(new GregorianCalendar(), dateValue);

			System.out.println(key + " was born in "
					+ dateValue.get(Calendar.YEAR) + " and is " + age
					+ " years old");
		}

	}

	private int calculateAge(GregorianCalendar nowDate,
			GregorianCalendar dateValue) {
		int result;

		result = nowDate.get(Calendar.YEAR) - dateValue.get(Calendar.YEAR);

		if (nowDate.get(Calendar.MONTH) < dateValue.get(Calendar.MONTH)) {
			/*
			 * If Date Value is 1986-04-06 and nowDate is 2014-01-10, then the
			 * age is 27 years XXX Days , not complete 28 years, So 27 years is
			 * displayed
			 */
			result = result - 1;
		} else if (nowDate.get(Calendar.MONTH) == dateValue.get(Calendar.MONTH)) {
			/*
			 * Similarly in case of Month is also equal : Date value :1986-04-06
			 * and NowDate :2014-04-01, then the age is 27 years 361 days, so
			 * not complete 28 days, so 27 is display only
			 */
			if (nowDate.get(Calendar.DAY_OF_MONTH) < dateValue
					.get(Calendar.DAY_OF_MONTH)) {
				result = result - 1;
			}
		}
		return result;
	}

	public static void main(String[] args) {

//		Interview interviewObj = new Interview();
//		interviewObj.iterateProcess();
//		interviewObj.displayName();
		
		short s = 0;
		int x = 8;
		int y = 9;
		int z = 123567;
		
		s+=z;
		System.out.println("" +x + y + s);
		
	}

}
