package com.fsanges.java;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FindMaxInt {

	private static int maxInt = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter integer numbers separated by space: ");

		String scanner_string = sc.nextLine();
		StringTokenizer st = new StringTokenizer(scanner_string);
		int num_token = st.countTokens();
		sc.close();

		// Array build
		int[] intArray = new int[num_token];

		int index_array = 0;
		while (st.hasMoreTokens()) {

			try {
				intArray[index_array] = Integer.parseInt(st.nextToken());
				index_array += 1;
			} catch (NumberFormatException nfe) {
				System.out.println("Not an integer");
			}
		}

		// call the method findMaxIntInArray
		maxInt = findMaxIntInArray(intArray);

		System.out.println("*** Initial Array ***");

		System.out.println(Arrays.toString(intArray));
		System.out.println("*** Max number in array ***");
		System.out.println(maxInt);
	}

	// Method findMaxIntInArray
	public static int findMaxIntInArray(int[] intArray) {

		int maxInt = intArray[0];
		for (int j = 0; j < intArray.length; j++) {
			System.out.println("current max: " + maxInt);
			System.out.println("current element analyzed: " + intArray[j]);

			if (maxInt < intArray[j]) {
				maxInt = intArray[j];
			}
		}
		System.out.println("Max: " + maxInt);

		return maxInt;

	}
}
