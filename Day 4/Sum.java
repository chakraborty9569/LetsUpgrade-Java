import java.util.Scanner;
public class Sum {
	public static void main(String[] args) {
		int a[]=new int[5];
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for (int i = 0; i < 5; i++)
			a[i]=sc.nextInt();
		
		int s=0;
		for (int i = 0; i < 5; i++)
			s+=a[i];
		
		System.out.println("Sum: "+s);
	}
}
