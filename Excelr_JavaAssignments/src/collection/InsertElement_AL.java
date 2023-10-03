package collection;

import java.util.ArrayList;
import java.util.List;

public class InsertElement_AL {

	public static void main(String[] args) {

		List<Integer> AL = new ArrayList<Integer>();

		AL.add(1);

		AL.add(2);

		AL.add(3);

		AL.add(4);

		AL.add(5);

		System.out.println(AL);

		// add element to first position - 0th index

		AL.add(0, 100); // 0 - index 100 - new number added at 0th element

		System.out.println(AL);

	}

}
