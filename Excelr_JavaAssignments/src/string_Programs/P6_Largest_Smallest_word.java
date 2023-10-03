package string_Programs;

public class P6_Largest_Smallest_word {

	public static void main(String[] args) {

		String string = "This is a java Program";

		String word = "";

		String smallest = "", largest = "";

		String[] words = new String[100];

		int length = 0;

// give extra spacing after string to get the last word in the given string
		string = string + " ";

		for (int i = 0; i < string.length(); i++) {

// Split the string into words
			if (string.charAt(i) != ' ') {
				word = word + string.charAt(i);
			} else {

// Add word to array words
				words[length] = word;

// Increment length
				length++;

// Make word an empty string
				word = "";
			}
		}

// Initialize small and large with first word in the string
		smallest = largest = words[0];

// Determine smallest and largest word in the string
		for (int k = 0; k < length; k++) {

// If length of small is greater than any word present in the string
// Store value of word into small
			if (smallest.length() > words[k].length())
				smallest = words[k];

// If length of large is less than any word present in the string
// Store value of word into large
			if (largest.length() < words[k].length())
				largest = words[k];

		}
		System.out.println("Given String is:" +string);
		System.out.println("Smallest word is: " + smallest);
		System.out.println("Largest word is: " + largest);

	}

}
