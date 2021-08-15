package com.algorithmprograms;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection {

	private static void strSplit(String[] str) {
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
	}

	private static void checkSize(String[] char1, String[] char2) {
		if (char1.length != char2.length)
			System.out.println("Strings are not anagram");
		else {
			Arrays.sort(char1);			//Alphabetically(Ascending)
			Arrays.sort(char2);
			if (Arrays.equals(char1, char2)) {			//comparing the elements
				System.out.println("Strings are anagram");
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("******* Welcome to Anagram Detection **********");
		System.out.println("Enter 1st string : ");
		String str1 = sc.nextLine();
		String[] char1 = str1.split("");
		System.out.println("Enter 2st string : ");
		String str2 = sc.nextLine();
		String[] char2 = str2.split("");
		checkSize(char1, char2);
		sc.close();
	}
}
