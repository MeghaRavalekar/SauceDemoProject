package operators_Loop_ControlStatements;

import java.util.Scanner;

public class P6_Check_Positive_Negative_Zero {

	public static void main(String[] args) {

//6. Write a program to check positive, negative or a zero

// create an object of Scanner class

		Scanner sc = new Scanner(System.in);

// Enter the number

		System.out.println("Enter the number :");

		int num = sc.nextInt();

		if (num > 0)

		{

			System.out.println("Positive Number");

		}

		else if (num < 0)

		{

			System.out.println(" Negative Number");

		}

		else

		{

			System.out.println("Zero Number");

		}

	}

}
