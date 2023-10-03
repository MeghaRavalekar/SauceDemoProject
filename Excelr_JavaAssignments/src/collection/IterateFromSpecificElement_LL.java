package collection;

import java.util.Iterator;
import java.util.LinkedList;

public class IterateFromSpecificElement_LL {

	public static void main(String[] args) {

		LinkedList<String> LL = new LinkedList<String>();

		LL.add("Pink");

		LL.add("Black");

		LL.add("Blue");

		LL.add("Green");

		LL.add("White");

		LL.add("Yellow");

		System.out.println("Orignal Linked List: " + LL);

		// Iterating from index 1

		System.out.println("Linked List After Iterating From 1st Element ");

		Iterator It = LL.listIterator(1);

		while (It.hasNext()) {
			System.out.println(It.next());
		}
	}

}
