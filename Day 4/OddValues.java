import java.util.*;
public class OddValues {
	public static void main(String[] args) {
		int a[]=new int[5];
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the array elements:");
		for (int i = 0; i < 5; i++)
			a[i]=sc.nextInt();
		
		for (int i = 0; i < 5; i++) {
			if(a[i]%2!=0)
				System.out.print(a[i]+" ");
		}
	}
}
