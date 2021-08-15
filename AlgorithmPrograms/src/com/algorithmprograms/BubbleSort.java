package com.algorithmprograms;

import java.util.Scanner;

public class BubbleSort {

	private static Scanner sc = new Scanner(System.in);
	private static int[] userArray;

	private static int userInput() {
		int input = sc.nextInt();
		return input;
	}

	private static void bubbleSort() {
		int temp = 0;
		for (int i = 0; i < userArray.length; i++) {
			for (int j = 1; j < (userArray.length - i); j++) {
				if (userArray[j - 1] > userArray[j]) {
					temp = userArray[j - 1];
					userArray[j - 1] = userArray[j];
					userArray[j] = temp;
				}
			}

		}
	}

	private static void printArray() {
		for (int i = 0; i < userArray.length; i++) {
			System.out.print(userArray[i] + " ");
		}
	}

	public static void main(String[] args) {
		System.out.println("********** Bubble Sort *********");
		System.out.println("How many values you want to enter: ");
		int size = userInput();
		userArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter value: ");
			userArray[i] = userInput();
		}

		System.out.println("Elements before sorting :");
		printArray();
		bubbleSort();
		System.out.println("Elements after sorting :");
		printArray();
	}
}
