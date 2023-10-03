package string_Programs;

public class P8_UniqueWords {

	static int uniquewords(String str) {

		String[] words = str.split(" ");

		boolean[] array = new boolean[words.length];

		int count = 0;

		for (int i = 0; i < words.length; i++) {
			if (!array[i]) {
				count++;

				for (int j = i + 1; j < words.length; j++) {
					if (words[j].compareTo(words[i]) == 0) {
						array[j] = true;
						count--;
					}
				}
			}
		}

		return count;
	}

	public static void main(String[] args) {

		String str = "Hi I am Megha Hi I ";
		
		System.out.println("given String Is: " + str );

		int count = uniquewords(str);
		System.out.println("Total number of unique words in given string are: " + count);

	}

}
