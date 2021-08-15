package com.algorithmprograms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InsertionSort {

	public static Scanner sc = new Scanner(System.in);
	public static List<String> userArray = new ArrayList<String>();
	public static List newArray = new ArrayList();

	public static String getInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		return input;
	}

	public static void printList() {
		for (int i = 0; i < userArray.size(); i++) {
			System.out.println(userArray.get(i));
		}
	}

	public static void insertionSort() {
		for (int i = 1; i < userArray.size(); i++) {
			String str = (String) userArray.get(i);
			int j = i - 1;
			String temp = (String) userArray.get(j);
			while (j >= 0 && temp.compareTo(str) > 0) {
				userArray.set(j + 1, userArray.get(j));
				j--;
			}
			userArray.set((Integer) (j + 1), str);

		}
		printList();
	}

	public static void main(String[] args) {
		System.out.println("******* Welcome to Insertion Sort ********");
		System.out.println("How many Integer you want to enter:");
		int size = sc.nextInt();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter integer: ");
			userArray.add(getInput());
		}
		printList();
		System.out.println("**** After Sorting ***");
		insertionSort();
		// printList();
	}
}
