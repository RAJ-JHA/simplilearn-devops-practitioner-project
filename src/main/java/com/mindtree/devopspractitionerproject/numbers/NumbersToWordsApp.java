package com.mindtree.devopspractitionerproject.numbers;

import java.util.Scanner;

public class NumbersToWordsApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = -1;
		Converter converter = new Converter();
		System.out.println("Enter number in the range of 1-999 for word conversion \nEnter '0' for exit");
		while (n != 0) {
			System.out.println("Enter number:");
			n = sc.nextInt();
			if (n == 0) {
				System.out.println("Exit");
			}
			String output = converter.convertToWords(n);
			System.out.println(output);
		}
		sc.close();
	}
}
