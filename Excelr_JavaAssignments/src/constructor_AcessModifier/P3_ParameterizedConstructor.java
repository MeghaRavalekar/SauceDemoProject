package constructor_AcessModifier;

public class P3_ParameterizedConstructor {

	int id;

	String name;

	int age;

	// creating a parameterized constructor

	P3_ParameterizedConstructor(int i, String n, int a) {
		id = i;

		name = n;

		age = a;

	}

	// method to display the values

	void display() {
		System.out.println(id + " " + name + " " + age);

	}

	public static void main(String[] args) {

		// creating objects and passing values

		P3_ParameterizedConstructor ob1 = new P3_ParameterizedConstructor(1, "ABC", 30);

		P3_ParameterizedConstructor ob2 = new P3_ParameterizedConstructor(2, "XYZ", 20);

		P3_ParameterizedConstructor ob3 = new P3_ParameterizedConstructor(3, "LMN", 10);

		// calling method to display the values of object

		ob1.display();

		ob2.display();

		ob3.display();

	}

}
