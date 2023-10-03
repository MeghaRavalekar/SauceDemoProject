package array_Assignments;

import java.util.Arrays;

public class P4_concatenate_TwoArrays_using_arraycopy {

	public static void main(String[] args) {

		// Declare 2 arrays

		int[] a1 = { 1, 2, 3, 4 };

		int[] a2 = { 5, 6, 7, 8 };

		// print the arrays

		System.out.print("First Array: ");
		for (int i = 0; i < a1.length; i++) {
			System.out.print(a1[i] + " ");
		}

		System.out.println();

		System.out.print("Second Array Array: ");
		for (int j = 0; j < a2.length; j++) {
			System.out.print(a2[j] + " ");
		}

		// Lenght of the array

		int L1 = a1.length;

		int L2 = a2.length;

		// Create new array to store result whose lenght is L1+L2

		int[] Result = new int[L1 + L2];

		// Use ArrayCopy
		System.arraycopy(a1, 0, Result, 0, L1);

		System.arraycopy(a2, 0, Result, L1, L2);

		System.out.println();

		System.out.print("concatenate Two Arrays using arraycopy:");

		System.out.println(Arrays.toString(Result));

	}

}
