package operators_Loop_ControlStatements;

import java.util.Scanner;

public class P5_EvenOdd {

	public static void main(String[] args) {

// 5.Write a program to check if number is even or odd

// create an object of Scanner class

		Scanner sc = new Scanner(System.in);

// Enter the number

		System.out.println("Enter the number :");

		int a = sc.nextInt();

		if (a % 2 == 0)

		{

			System.out.println("Above Number Is Even number");

		}

		else

		{

			System.out.println("Above Number Is Odd number");

		}

	}

}
