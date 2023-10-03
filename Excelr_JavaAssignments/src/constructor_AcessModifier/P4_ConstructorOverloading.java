package constructor_AcessModifier;

public class P4_ConstructorOverloading {

	private String Name;

	private int Age;

	// Default Constructor

	public P4_ConstructorOverloading() {
		Name = "";

		Age = 0;

	}

	// Constructor that takes a name parameter
	public P4_ConstructorOverloading(String name) {
		this.Name = name;
		Age = 0;
	}

	// Constructor that takes both name and age parameters
	public P4_ConstructorOverloading(String name, int age) {
		this.Name = name;
		this.Age = age;
	}

	// method to display the value

	public String toString() {
		return Name + " " + Age;
	}

	public static void main(String[] args) {

		P4_ConstructorOverloading ob1 = new P4_ConstructorOverloading();

		System.out.println(ob1.toString());

		P4_ConstructorOverloading ob2 = new P4_ConstructorOverloading("ABC");

		System.out.println(ob2.toString());

		P4_ConstructorOverloading ob3 = new P4_ConstructorOverloading("XYZ", 10);

		System.out.println(ob3.toString());

	}

}
