package array_Assignments;

public class P1_Sum_Avg_ArrayElements {

	public static void main(String[] args) {

		// Initialize array

		int[] a = { 10, 20, 30, 40, 50 };

		int sum = 0;

		// traverse through array using for loop

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

		}

		System.out.println("sum of array element is:" + sum);

		int avg = sum / a.length;

		System.out.println("avg of array element is:" + avg);

	}

}
