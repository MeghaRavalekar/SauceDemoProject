package string_Programs;

public class P4_Reverse_EachWord_In_String {

	public static void main(String[] args) {

		// String
		String str = "This Is String";

		System.out.println("Orignal String Is : " + str);

//Split string by spaces and store it into string array arr - string splitted into multiple words
		String[] Words = str.split(" ");

//create empty string
		String ReverseString = " ";

//For loop to read each and every word in string
		for (String w : Words) {
			String ReverseWord = "";

			for (int i = w.length() - 1; i >= 0; i--) {
				ReverseWord = ReverseWord + w.charAt(i);
			}

			ReverseString = ReverseString + ReverseWord + " ";
		}

		System.out.println("Reverse String Is : " + ReverseString);

	}

}
