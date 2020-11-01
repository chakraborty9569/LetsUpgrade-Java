import java.util.*;
public class Employee {
	private String name, designation;
	private int age, salary;
	
	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name=sc.nextLine();
		
		System.out.print("Enter age: ");
		age=sc.nextInt();
		
		System.out.print("Enter salary: ");
		salary=sc.nextInt();
		
		System.out.print("Enter designation: ");
		designation=sc.next();
	}
	
	public void display() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Salary: "+salary);
		System.out.println("Designation: "+designation);
	}
}
