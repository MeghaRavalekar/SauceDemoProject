package string_Programs;

public class P1_StringConcat {

	public static void main(String[] args) {

		String S1 = "Hello";

		String S2 = "World";

// String Concatenation by +

		System.out.println(S1 + S2);

// String Concatenation by concat()

		System.out.println(S1.concat(S2));

		System.out.println(S1.concat(" ").concat(S2));

		System.out.println(S1.concat(S2).concat("JAVA"));

		System.out.println(S1.concat(" ").concat(S2).concat(" ").concat("JAVA"));

	}

}
