package constructor_AcessModifier;

public class P1_DefualtConstructor {

	int Id;

	String Name;

	int Age;

	// creating a default constructor

	P1_DefualtConstructor() {
		System.out.println("Default Constructor");
	}

	public static void main(String[] args) {

		// Default constructor is called to create a new object

		P1_DefualtConstructor ob = new P1_DefualtConstructor();

		ob.Id = 1;

		ob.Name = "Megha";

		ob.Age = 30;

		System.out.println(ob.Id);

		System.out.println(ob.Name);

		System.out.println(ob.Age);

	}

}
