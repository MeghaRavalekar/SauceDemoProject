package string_Programs;

public class P7_First_Nonrepeated_Character {

	public static void main(String[] args) {

		String str = "AACDBECD";
		
		System.out.println("given String Is : " + str);

		for (int i = 0; i < str.length(); i++) // get all char of string

		{

			boolean unique = true;

			for (int j = 0; j < str.length(); j++) // compare current element with other element

			{

				if (i != j && str.charAt(i) == str.charAt(j)) {
					unique = false;
				}
			}

			if (unique) {
				System.out.println("First non repeated char at given string is : " +str.charAt(i));
				break;
			}
		}
	}
}
