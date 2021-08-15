package com.algorithmprograms;

import java.io.*;
import java.util.*;

public class BinaryWordSearch {

	private static int count = 0;
	private static List<String> wordList = new ArrayList<String>();

	private static String getInput() {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		sc.close();
		return input;
	}

	private static void readFile() throws IOException {
		File file = new File("src/demoprogram/textfile");
		BufferedReader br = new BufferedReader(new FileReader(file));
		String str;
		while ((str = br.readLine()) != null) {
			String words[] = str.split(" ");		//Splitting of String but matches the regular data.
			count = count + words.length;
			for (int i = 0; i < words.length; i++) {
				wordList.add(words[i]);
			}
		}
	}

	private static void search(String searchWord) {
		sort();
		int start = 0;
		int end = count;
		int mid = (start + end) / 2;
		while (start <= end) {
			String temp = (String) wordList.get(mid);
			if (temp.equals(searchWord)) {
				System.out.printf("%s => Word found !!\n", searchWord);
				break;
			} else if (temp.compareTo(searchWord) > 0) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
			mid = (start + end) / 2;
		}
		if (start > end) {
			System.out.println("Word is not found!");
		}
	}

	private static void sort() {
		Collections.sort(wordList);
	}

	public static void main(String[] args) throws IOException {
		// System.out.println("***** Search a word in paragraph ****");
		System.out.println("Enter word which you want to search from file: ");
		String searchWord = getInput();
		readFile();
		search(searchWord);
	}
}
