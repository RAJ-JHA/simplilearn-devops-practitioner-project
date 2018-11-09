package com.mindtree.devopspractitionerproject.numbers;

import java.util.HashMap;
import java.util.Map;

public class Converter {
	Map<Integer, String> oneToNineteenMap = new HashMap<>();
	Map<Integer, String> tenStringMap = new HashMap<>();

	public Converter() {

		oneToNineteenMap.put(1, "one");
		oneToNineteenMap.put(2, "two");
		oneToNineteenMap.put(3, "three");
		oneToNineteenMap.put(4, "four");
		oneToNineteenMap.put(5, "five");
		oneToNineteenMap.put(6, "six");
		oneToNineteenMap.put(7, "seven");
		oneToNineteenMap.put(8, "eight");
		oneToNineteenMap.put(9, "nine");
		oneToNineteenMap.put(10, "ten");
		oneToNineteenMap.put(11, "eleven");
		oneToNineteenMap.put(12, "twelve");
		oneToNineteenMap.put(13, "thirteen");
		oneToNineteenMap.put(14, "fourteen");
		oneToNineteenMap.put(15, "fifteen");
		oneToNineteenMap.put(16, "sixteen");
		oneToNineteenMap.put(17, "seventeen");
		oneToNineteenMap.put(18, "eighteen");
		oneToNineteenMap.put(19, "nineteen");

		tenStringMap.put(20, "twenty");
		tenStringMap.put(30, "thirty");
		tenStringMap.put(40, "fourty");
		tenStringMap.put(50, "fifty");
		tenStringMap.put(60, "sixty");
		tenStringMap.put(70, "seventy");
		tenStringMap.put(80, "eighty");
		tenStringMap.put(90, "ninty");
	}

	public String convertToWords(int number) {
		if (number < 0 || number > 999) {
			return "Invalid number";
		}

		String word = "";

		char[] digits = String.valueOf(number).toCharArray();
		int highestIndex = digits.length;

		boolean finished = false;
		for (int i = 0; i < digits.length; i++) {
			switch (highestIndex) {
			case 1:
				if (digits[i] != '0') {
					word = word + " " + oneToNineteenMap.get(Integer.parseInt(String.valueOf(digits[i])));
				}
				break;
			case 2:
				if (digits[i] != '0') {
					if (digits[i] == '1') {
						word += oneToNineteenMap
								.get(Integer.parseInt(String.valueOf(digits[i]) + String.valueOf(digits[i + 1])));
						finished = true;
					} else {
						word = word + " " + tenStringMap.get(Integer.parseInt(String.valueOf(digits[i]) + "0"));
					}
				}
				break;
			case 3:
				word = word + " " + oneToNineteenMap.get(Integer.parseInt(String.valueOf(digits[i]))) + " hundred";
			}
			if (finished) {
				break;
			}
			highestIndex--;
		}
		return word.trim();
	}
}
