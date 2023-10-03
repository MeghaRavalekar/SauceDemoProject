package string_Programs;

public class P10_AnagramofString_Is_Palindrome {

	public static boolean result = false;

	public static void main(String[] args) {

		String str = "aabbcd";
		
		System.out.println("Given string is : " +str);

		anagram(str, "");

		System.out.println("Check Anagram of a String is Palindrome or not ? --> "  + result);
	}

	public static void anagram(String str, String asf) {

		if (str.length() == 0) {

			if (isPalindrom(asf))

				result = true;

			return;
		}

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			String left = str.substring(0, i);
			String right = str.substring(i + 1);
			anagram(left + right, asf + ch);
		}
	}

	public static boolean isPalindrom(String str) {
		int left = 0;
		int right = str.length() - 1;
		while (left <= right) {

			if (str.charAt(left) != str.charAt(right))

				return false;

			left++;

			right--;
		}
		return true;
	}
}
