import java.util.*;
public class Employee {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Name: ");
		String name=sc.nextLine();
		
		System.out.print("Enter date of birth: ");
		int day=sc.nextInt();
		
		System.out.print("Enter month of birth: ");
		int m=sc.nextInt();
		
		System.out.print("Enter year of birth: ");
		int y=sc.nextInt();
		
		System.out.print("Enter monthly salary: ");
		int sal=sc.nextInt();
		System.out.println();
		
		System.out.println("Name: "+name);
		System.out.println("Age: "+(2020-y));
		System.out.println("Annual Salary: Rs."+(sal*12));
		
		if(sal*12 >500000)
			System.out.println("Tax: Rs."+(sal*10*0.2));
		else if(sal*12 >400000 && sal*12 <=500000)
			System.out.println("Tax: Rs."+(sal*12*0.15));
		else if(sal*12 >300000 && sal*12 <=400000)
			System.out.println("Tax: Rs."+(sal*12*0.1));
		else if(sal*12 >200000 && sal*12 <=300000)
			System.out.println("Tax: Rs."+(sal*12*0.05));
		else
			System.out.println("No Tax");
		
	}
}
