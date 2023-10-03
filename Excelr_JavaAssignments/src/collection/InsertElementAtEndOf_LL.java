package collection;

import java.util.LinkedList;

public class InsertElementAtEndOf_LL {

	public static void main(String[] args) {

		LinkedList<String> LL = new LinkedList<String>();

		// use add() method to add values in the linked list
		LL.add("Red");
		LL.add("Green");
		LL.add("Black");
		System.out.println("Original linked list:" + LL);

		// Add an element at the end of a linked list
		LL.offerLast("Pink");
		System.out.println("Final linked list:" + LL);

	}

}
