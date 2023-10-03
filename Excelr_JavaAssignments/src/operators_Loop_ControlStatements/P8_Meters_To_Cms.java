package operators_Loop_ControlStatements;

import java.util.Scanner;

public class P8_Meters_To_Cms {

	public static void main(String[] args) {

// Write a program to convert meters to cms

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the meter value:");

		int m = sc.nextInt();

		int cm = m * 100;

		System.out.println(" meter to cm conversion values is : " + cm);

	}

}
