package inheritance_Poly;

class Addition {

//Method with 2 int
	static int Add(int a, int b) {
		return a + b;
	}

//Method with 3 int
	static int Add(int a, int b, int c) {
		return a + b + c;
	}

//Method with 2 double
	static double Add(double a, double b) {
		return a + b;
	}

//Method with 2 strings
	static String Add(String a, String b) {
		return a + b;
	}

}

public class CompileTime_MethodOverloading {

	public static void main(String[] args) {

		System.out.println("Addition Method with 2 integer values");

		System.out.println(Addition.Add(14, 12));

		System.out.println("Addition Method with 3 integer values");

		System.out.println(Addition.Add(14, 12, 92));

		System.out.println("Addition Method with 2 double values");

		System.out.println(Addition.Add(1.5, 1.1));

		System.out.println("Addition Method with 2 String values");

		System.out.println(Addition.Add("Java", "Program"));

	}

}
