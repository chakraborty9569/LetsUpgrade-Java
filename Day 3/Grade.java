import java.util.*;
public class Grade {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 subject marks out of 100:");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		int d=sc.nextInt();
		int e=sc.nextInt();
		
		float percentage=(a+b+c+d+e)/(float)5;
		
		if(percentage>=85)
			System.out.println("Grade: A and Percentage: "+percentage+"%");
		else if(percentage>=75 && percentage<85)
			System.out.println("Grade: B and Percentage: "+percentage+"%");
		else if(percentage>=60 && percentage<75)
			System.out.println("Grade: C and Percentage: "+percentage+"%");
		else if(percentage>=50 && percentage<60)
			System.out.println("Grade: D and Percentage: "+percentage+"%");
		else if(percentage>=40 && percentage<50)
			System.out.println("Grade: E and Percentage: "+percentage+"%");
		else
			System.out.println("Grade: F and Percentage: "+percentage+"%");
		
	}
}
