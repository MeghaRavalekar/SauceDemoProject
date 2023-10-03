package java_Variable;

public class InstanceVariable {

// declared in class and outside of method, constructor or block
//it can be accessed by any of the method of that class

	int c; // instance variable

	public void addition()

	{
		int a = 10; // local variable

		int b = 20; // local variable

		int c = a + b;

		System.out.println("Addition is:" + c);

	}

	public void Subtraction()

	{
		int x = 100; // local variable

		int y = 20; // local variable

		int c = x - y;

		System.out.println("subtraction is:" + c);

	}

	public static void main(String[] args) {

		InstanceVariable ob = new InstanceVariable();

		ob.addition();

		ob.Subtraction();

	}
}
