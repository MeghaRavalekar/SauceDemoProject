package operators_Loop_ControlStatements;

public class P7_Largest_ThreeNumbers {

	public static void main(String[] args) {

//Write a program to find the largest of three numbers

		int a = 140;

		int b = 1200;

		int c = 92;
		
		System.out.println("first number is:" +a);
		System.out.println("second number is:" +b);
		System.out.println("third number is:" +c);

		if (a > b && a > c)

		{
			System.out.println(a + " : is greater");
		}

		else if (b > a && b > c)

		{
			System.out.println(b + " : is greater");
		}

		else if (c > b && c > a)

		{
			System.out.println(c + " : is greater");
		}

	}

}
