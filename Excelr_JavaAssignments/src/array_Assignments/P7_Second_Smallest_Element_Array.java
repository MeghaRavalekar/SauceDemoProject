package array_Assignments;

public class P7_Second_Smallest_Element_Array {

	public static void main(String[] args) {

		int[] a = { 6, 2, 8, 4, 9, 1, 3 };

		int temp;

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {

					temp = a[i];

					a[i] = a[j];

					a[j] = temp;
				}
			}
		}

		// Print Array in Ascending order
		System.out.println("Array in Ascending order:");

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.println();
		System.out.println("second Smallest element is :" + a[1]);

	}

}
