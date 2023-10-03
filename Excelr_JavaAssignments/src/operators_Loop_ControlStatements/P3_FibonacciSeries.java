package operators_Loop_ControlStatements;

public class P3_FibonacciSeries {

	public static void main(String[] args) {

//3.Write a program to print Fibonacci Series using for loop

		int n1 = 0;

		int n2 = 1;

		int count = 10;

		int n3;

//Start for loop from i = 2 because first two number given as 0 & 1

		for (int i = 2; i <= count; i++) {
			n3 = n1 + n2;

			System.out.print(" " + n3);

			n1 = n2;

			n2 = n3;

		}

	}

}
