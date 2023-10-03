package string_Programs;

public class P2_RemoveCharacters_from_String {

	public static void main(String[] args) {

		String str = " This IS JAVA string program 1234";

//Remove small letter 'a '  from a string 
		System.out.println("String after removing small letter a = " + str.replace("a", ""));

// Remove spaces from a string 
		System.out.println("String after removing all the spaces = " + str.replace(" ", ""));

// Remove all the lowercase letters from a string 
		System.out.println("String after removing all the lowercase letters = " + str.replaceAll("[a-z]", ""));

// Remove all the Uppercase letters from a string 
		System.out.println("String after removing all the Uppercase letters = " + str.replaceAll("[A-Z]", ""));

// Remove the last character from a string
		System.out.println("String after removing the last character =" + str.substring(0, str.length() - 1));

// Remove a substring from a string 
		System.out.println("String after removing the first 'Th' substring = " + str.replaceFirst("Th", ""));

	}

}
