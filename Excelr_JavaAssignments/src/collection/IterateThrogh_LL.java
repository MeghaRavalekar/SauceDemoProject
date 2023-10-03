package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class IterateThrogh_LL {

	public static void main(String[] args) {

		LinkedList<String> LL = new LinkedList<String>();

		LL.add("Pink");

		LL.add("Black");

		LL.add("Blue");

		LL.add("Green");

		LL.add("White");

		LL.add("Yellow");

		// Using list iterator
		Iterator It = LL.listIterator();

		while (It.hasNext())

		{
			System.out.print(It.next());
			System.out.print(", ");
		}

	}

}
