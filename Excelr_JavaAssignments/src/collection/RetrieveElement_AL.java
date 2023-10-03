package collection;

import java.util.ArrayList;
import java.util.List;

public class RetrieveElement_AL {

	public static void main(String[] args) {

		List<String> AL = new ArrayList<String>();

		AL.add("Pink");

		AL.add("Black");

		AL.add("Blue");

		AL.add("Green");

		AL.add("White");

		AL.add("Yellow");

		System.out.println(AL);

		// Retrive the first element

		String Fcolor = AL.get(0);

		System.out.println("First Element in AL : " + Fcolor);

		// Retrive the last element

		String Lcolor = AL.get(AL.size() - 1);

		System.out.println("Last Element in AL :" + Lcolor);

	}

}
