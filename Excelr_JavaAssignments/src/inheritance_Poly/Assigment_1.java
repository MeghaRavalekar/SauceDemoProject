package inheritance_Poly;

class parent {
	public void ParentMethod() {
		System.out.println("This is parent class.");
	}
}

class child extends parent {
	public void ChildMethod() {
		System.out.println("This is child class.");
	}
}

public class Assigment_1 {

	public static void main(String[] args) {

//object of parent class

		parent p = new parent();

//object of child class

		child c = new child();

// calling method of parent class by object of parent class

		p.ParentMethod();

//calling method of child class by object of child class

		c.ChildMethod();

// calling method of parent class by object of child class
		c.ParentMethod();

	}

}
