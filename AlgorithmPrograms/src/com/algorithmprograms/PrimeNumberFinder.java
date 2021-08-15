package com.algorithmprograms;

import java.util.Scanner;

public class PrimeNumberFinder {

	private static void findPrime(int start, int end) {
		int flag;
		for (int i = start; i <= end; i++) {
			if (i == 1 || i == 0)
				continue;
			flag = 1;
			for (int j = 2; j < i / 2; j++) {
				if (i % j == 0) {
					flag = 0;
					break;
				}
			}
			if (flag == 1)
				System.out.println(i);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("****** Prime Number ********");
		System.out.println("Enter start value: ");
		int start = sc.nextInt();
		System.out.println("Enter end value: ");
		int end = sc.nextInt();
		findPrime(start, end);
	}
}
