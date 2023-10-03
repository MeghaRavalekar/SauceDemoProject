package array_Assignments;

public class P8_LargestTwoNumbers {

	public static void main(String[] args) {

		int[] array = { 6, 2, 8, 4, 9, 1, 3 };

		int largest1, largest2, temp;

		largest1 = array[0];
		largest2 = array[1];

		if (largest1 < largest2) {
			temp = largest1;
			largest1 = largest2;
			largest2 = temp;
		}
		for (int i = 2; i < array.length; i++) {
			if (array[i] > largest1) {
				largest2 = largest1;
				largest1 = array[i];
			} else if (array[i] > largest2 && array[i] != largest1) {
				largest2 = array[i];
			}
		}

		System.out.println("First largest number is " + largest1);
		System.out.println("Second largest number  is " + largest2);

	}

}
