package collection;

import java.util.ArrayList;
import java.util.List;

public class SearchElement_AL {

	public static void main(String[] args) {

		List<String> AL = new ArrayList<String>();

		AL.add("Pink");

		AL.add("Black");

		AL.add("Blue");

		AL.add("Green");

		AL.add("Red");

		AL.add("Yellow");

		System.out.println(AL);

		// Search the value Red

		if (AL.contains("Red")) {
			System.out.println("Element is found");
		}

		else {
			System.out.println("Element not found");
		}

	}

}
