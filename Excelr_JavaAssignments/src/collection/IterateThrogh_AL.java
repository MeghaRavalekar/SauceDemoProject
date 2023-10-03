package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class IterateThrogh_AL {

	public static void main(String[] args) {

		List<String> AL = new ArrayList<String>();

		AL.add("Pink");

		AL.add("Black");

		AL.add("Blue");

		AL.add("Green");

		AL.add("White");

		AL.add("Yellow");

		// Using For Loop

		System.out.println("Iterate through ArrayList using for loop");

		for (int i = 0; i < AL.size(); i++) {
			System.out.print(AL.get(i));

			System.out.print(", ");

		}

		System.out.println();
		// Using for each loop

		System.out.println('\n' + "Iterate through ArrayList using for-each loop");

		for (String e : AL) {
			System.out.print(e);

			System.out.print(", ");
		}

		System.out.println();
		// Using list iterator

		System.out.println('\n' + "Iterate through ArrayList using list iterator");

		ListIterator<String> It = AL.listIterator();

		while (It.hasNext()) {
			System.out.print(It.next() + " , ");
		}

	}
}
