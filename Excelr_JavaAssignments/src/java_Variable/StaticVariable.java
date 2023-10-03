package java_Variable;

public class StaticVariable {

	int empid;

	String name;

	static String CompanyName = "Test Company"; // Static variable

	StaticVariable(int empid, String name) {
		this.empid = empid;

		this.name = name;
	}

	void display() {
		System.out.println(empid + " " + name + " " + CompanyName);

	}

	public static void main(String[] args) {

		StaticVariable ob1 = new StaticVariable(1, "Megha");
		ob1.display();

		StaticVariable ob2 = new StaticVariable(2, "Test");
		ob2.display();

	}

}
