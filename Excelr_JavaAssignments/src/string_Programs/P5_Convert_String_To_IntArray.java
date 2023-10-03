package string_Programs;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P5_Convert_String_To_IntArray {

	static int[] ConversionMethod(String str) {
// Split the array
		String[] splitArray = str.split(" ");

// Create new array having length is = length of split array
		int[] array = new int[splitArray.length];

// parsing the String as a integer and storing that integer into the array
		for (int i = 0; i < splitArray.length; i++) {

			array[i] = Integer.parseInt(splitArray[i]);

		}

		return array;
	}

	public static void main(String[] args) {

		// declare Bufferedreader
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// string declaration
		String str = "1 23 456 7890";

		// Parse the string into method
		int[] array = ConversionMethod(str);

		// printing the string
		System.out.print("\nString is : " + str);

		// printing the Integer array
		System.out.print("\nInteger array is: [");
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

		System.out.print("]");
	}
}