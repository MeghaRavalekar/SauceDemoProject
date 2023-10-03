package string_Programs;

import java.util.Scanner;

public class P9_PalindromeString {

	public static void main(String[] args) {

		// Create scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Orignal String:");
		String str = sc.next();

		// Store input string into another string
		String Org = str;

		// Create empty string
		String Rev = "";

		// length of the string
		int len = str.length();

		// Reverse every word of string
		for (int i = len - 1; i >= 0; i--) {
			Rev = Rev + str.charAt(i);
		}

		System.out.println("Reverse string is: " + Rev);

		if (Org.equals(Rev)) {
			System.out.println("String is Palindrome");
		}

		else {
			System.out.println("String is not Palindrome");
		}
	}

}
