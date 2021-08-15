package com.algorithmprograms;

import java.util.Scanner;

public class MergeSort {

	private static Scanner sc = new Scanner(System.in);
	private static int[] userArray;

	private static int userInput() {
		int input = sc.nextInt();
		return input;
	}

	private static void printArray() {
		for (int i = 0; i < userArray.length; i++) {
			System.out.print(userArray[i] + " ");
		}
	}

	private static void sort(int userArray[], int l, int r) {
		if (l < r) {
			int m = l + (r - l) / 2;
			sort(userArray, l, m);
			sort(userArray, m + 1, r);
			mergeSort(userArray, l, m, r);
		}
	}

	private static void mergeSort(int[] userArray, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		int L[] = new int[n1];
		int R[] = new int[n2];
		for (int i = 0; i < n1; ++i)
			L[i] = userArray[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = userArray[m + 1 + j];
		int i = 0, j = 0;

		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				userArray[k] = L[i];
				i++;
			} else {
				userArray[k] = R[j];
				j++;
			}
			k++;
		}
		while (i < n1) {
			userArray[k] = L[i];
			i++;
			k++;
		}
		while (j < n2) {
			userArray[k] = R[j];
			j++;
			k++;
		}

	}

	public static void main(String[] args) {
		System.out.println("********** Merge Sort *********");
		System.out.println("How many values you want to enter: ");
		int size = userInput();
		userArray = new int[size];
		for (int i = 0; i < size; i++) {
			System.out.println("Enter value: ");
			userArray[i] = userInput();
		}
		System.out.println("Elements before sorting :");
		printArray();
		sort(userArray, 0, userArray.length - 1);
		System.out.println("\nElements after sorting :");
		printArray();
	}
}
