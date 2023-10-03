package operators_Loop_ControlStatements;

public class P4_Sum_NaturalNumbers {

	public static void main(String[] args) {

		// 4.Write a program to find sum of natural numbers using for loop

		int sum = 0;

		int num = 10;

		for (int i = 0; i <= num; i++) {
//adding the value of i into sum variable  
			sum = sum + i;
		}

		System.out.println("Sum of First 10 Natural Numbers is = " + sum);

	}

}
