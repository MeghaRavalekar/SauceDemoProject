package operators_Loop_ControlStatements;

import java.util.Scanner;

//2.Write a program to find factorial of a number using loops

public class P2_FactorialNumber {

	public static void main(String[] args) {

// create an object of Scanner class

		Scanner sc = new Scanner(System.in);

// Enter the number

		System.out.println("Enter the number :");

		int num = sc.nextInt();

		int fact = 1;

		for (int i = 1; i <= num; i++) {

			fact = fact * i;

		}

		System.out.println("Factorial of given number is:" + fact);

	}

}
