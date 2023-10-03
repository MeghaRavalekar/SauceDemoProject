package inheritance_Poly;

//Parent class

class ParentClass {
// Method of parent class
	void Print() {
		System.out.println("Parent Class Method");
	}
}

//child1 class
class Child1 extends ParentClass {
//Method of Child1 class
	void Print() {
		System.out.println("Child1 Class Method");
	}
}

//child2class
class Child2 extends ParentClass {
//Method of Child2 class
	void Print() {
		System.out.println("Child2 Class Method");
	}
}

public class RunTime_Overriding {

	public static void main(String[] args) {

//child1 class object

		Child1 C1 = new Child1();

// overriden method is called through a refernce varibale of super class

		ParentClass P = new Child1(); // up casting

		P.Print();

	}

}
