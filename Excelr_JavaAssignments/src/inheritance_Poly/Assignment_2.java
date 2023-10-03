package inheritance_Poly;

class Member {
	protected String name;
	protected int age;
	protected int phoneNo;
	protected String address;
	protected int salary;

	public void printSalary() {
		System.out.println("Salary: " + salary);
	}
}

class Employee extends Member {
	String specialization;

	Employee(String name, int age, int phoneNo, String address, int salary) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.salary = salary;

	}
}

class Manager extends Member {
	String department;

	Manager(String name, int age, int phoneNo, String address, int salary) {
		this.name = name;
		this.age = age;
		this.phoneNo = phoneNo;
		this.address = address;
		this.salary = salary;
	}
}

public class Assignment_2 {

	public static void main(String[] args) {

		Employee Emp = new Employee("Megha", 30, 123456789, "Pune", 25000);

		Manager Mgr = new Manager("Abc", 31, 98989898, "Mumbai", 55000);

		Emp.printSalary();

		Mgr.printSalary();

	}

}
