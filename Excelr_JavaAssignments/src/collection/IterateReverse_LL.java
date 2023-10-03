package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateReverse_LL {

	public static void main(String[] args) {

		LinkedList<String> LL = new LinkedList<String>();

		LL.add("Pink");

		LL.add("Black");

		LL.add("Blue");

		LL.add("Green");

		LL.add("White");

		LL.add("Yellow");

		System.out.println("Orignal Linked List: " + LL);

		// Reverse order

		System.out.println("Linked List in Reverse Order: ");

		Iterator It = LL.descendingIterator();

		while (It.hasNext()) {
			System.out.println(It.next());
		}

	}

}
