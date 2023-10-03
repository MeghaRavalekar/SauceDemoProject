//Write a Java program to Print a Multi-dimensional Array

package array_Assignments;

public class P3_Print_MultidimensionalArray {

	public static void main(String[] args) {

		String[][] a = {

				{ "abc", "def", "ghi" }, { "jkl", "mno", "pqr" }, { "stu", "vwx", "xyz" }, };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {
				System.out.print(a[i][j] + " ");
			}

			System.out.println();
		}

	}

}
