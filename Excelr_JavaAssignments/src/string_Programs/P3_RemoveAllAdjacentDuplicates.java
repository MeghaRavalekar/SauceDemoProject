package string_Programs;

import java.util.Stack;

public class P3_RemoveAllAdjacentDuplicates {

	public static String RemoveAllAdjacentDuplicates(String str)

	{

//Create Stack of Characters
		Stack<Character> st = new Stack();

//Create String Builder to add stack element into string
		StringBuilder sb = new StringBuilder();

//traverse through string using for loop

		for (int i = 0; i < str.length(); i++) {

//first check is empty or not -- if stack is not empty AND
//last element of stack = current element then pop it from stack
//else add it inot stack

			if (!st.isEmpty() && st.peek() == str.charAt(i)) {
				st.pop();
			}

			else {
				st.add(str.charAt(i));
			}
		}

//remove element from stack and add into string builder until the stack is not empty

		while (!st.isEmpty()) {
			sb.append(st.pop());
		}

		return sb.reverse().toString();
	}

	public static void main(String[] args) {

		String str = "caaabbbc";

		System.out.println("Orignal String Is:" + str);

		System.out.println("String After Removing All Adjacent Auplicates Is :" + RemoveAllAdjacentDuplicates(str));

	}

}
