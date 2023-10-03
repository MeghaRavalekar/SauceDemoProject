package constructor_AcessModifier;

//we will create two classes A and PrivateAccessModifier within the same package constructo_AcessModifier.

// We will declare a method in class A as private and 

// try to access this method from class constructo_AcessModifier and see the result.

class A {
	private void display() {
		System.out.println("Class A Display Method");
	}
}

public class PrivateAccessModifier {

	public static void main(String[] args) {

		// Object of Class A

		A obj = new A();

		// Trying to access private method of another class

		//obj.display();

	}

}
