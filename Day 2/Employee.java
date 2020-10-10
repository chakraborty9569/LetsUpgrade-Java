
public class Employee {
	String name, city;
	int age;
	public static void main(String args[]) {
		Employee e1 = new Employee();
		e1.name="Saurab";
		e1.age=23;
		e1.city="chennai";
		
		Employee e2 = new Employee();
		e2.name="Sumit";
		e2.age=21;
		e2.city="kolkata";
		
		e1.display();
		System.out.println();
		e2.display();
	}
	public void display() {
		System.out.println("The name is "+name);
		System.out.println("The age is "+age);
		System.out.println("The city is "+city);
	}
}
