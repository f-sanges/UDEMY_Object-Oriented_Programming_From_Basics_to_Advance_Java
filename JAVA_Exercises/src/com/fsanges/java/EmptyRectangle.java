package com.fsanges.java;
import java.util.Scanner;

public class EmptyRectangle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter height of rectangle: ");
		int height = sc.nextInt();
		System.out.print("Please, enter width of rectangle: ");
		int width = sc.nextInt();
		sc.close();

		drawRectangle(height, width);
	}

	public static void drawRectangle(int height, int width) {

		int white_spaces = width - 2;
		// Create an empty string containing n number of 0x00 characters, and the
		// built-in String replace method does the rest.
		String str_white_spaces = new String(new char[white_spaces]).replace("\0", " ");

		for (int i = 0; i < width; i++) {
			System.out.print("*");
		}
		System.out.println();
		for (int j = 0; j < height - 2; j++) {
			System.out.print("*");
			System.out.print(str_white_spaces);
			System.out.println("*");

		}
		for (int i = 0; i < width; i++) {
			System.out.print("*");
		}

	}

}
