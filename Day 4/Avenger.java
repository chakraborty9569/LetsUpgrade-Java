import java.util.*;
public class Avenger {
	String name, weapon, planet;
	int age, power;
	
	public static void main(String[] args) {
		Avenger avn[] = new Avenger[5];
		
		for (int i = 0; i < 5; i++)
		{
			avn[i]=new Avenger();
			avn[i].getDetails();
		}
		
		for (int i = 0; i < 5; i++)
			avn[i].displayDetails();
	}
	
	public void getDetails() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Name: ");
		name=sc.nextLine();
		System.out.print("Enter Age: ");
		age=sc.nextInt();
		System.out.print("Enter Power: ");
		power=sc.nextInt();
		System.out.print("Enter Weapon: ");
		weapon=sc.nextLine();
		System.out.print("Enter Planet: ");
		planet=sc.next();
		System.out.println();
	}
	
	public void displayDetails() {
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Power: "+power);
		System.out.println("Weapon: "+weapon);
		System.out.println("Planet: "+planet);
		System.out.println();
	}
}
