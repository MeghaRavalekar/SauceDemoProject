package operators_Loop_ControlStatements;

import java.util.Scanner;

//Write a program to make a Simple Calculator using Switch Case

public class P1_CalculatorUsingSwitchCase {

	public static void main(String[] args) {

// create an object of Scanner class

		Scanner sc = new Scanner(System.in);

// Enter the first number

		System.out.println("Enter value of 1st number :");

		int a = sc.nextInt();

// Enter the second number

		System.out.println("Enter value of 2nd number :");

		int b = sc.nextInt();

// Select operation

		System.out.println("Select Operator: +, -, *,  /");

		char Operator = sc.next().charAt(0);

// Switch case

		switch (Operator) {
		case '+':
			System.out.println("Addition of the given two numbers: " + (a + b));
			break;

		case '-':
			System.out.println("subtraction of the given two numbers: " + (a - b));
			break;

		case '*':
			System.out.println("Multiplication of the given two numbers: " + (a * b));
			break;

		case '/':
			System.out.println("Divison of the given two numbers: " + (a / b));
			break;

		default:
			System.out.println("No Operator Selected");

		}

	}

}
