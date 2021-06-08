package com.fsanges.java;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AmountOfWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, enter any text: ");
	
    
	    String scanner_string = sc.nextLine();
		sc.close();
	    int amountOfWords = getWordsAmount(scanner_string);
	
		//System.out.println("Amount of words in your text: " + amountOfWords);
	    System.out.println(amountOfWords);
	}

	public static int getWordsAmount(String text) {
		StringTokenizer st = new StringTokenizer(text);
		int num_token = st.countTokens();
		return num_token;
	}
}

