import java.util.*;

class marriage{
	public static void main(String args[]){
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter your Gender 'm' or 'f' ");
		char Gender = sc.next().charAt(0);
		
		System.out.println("Enter your Age");
		int Age = sc.nextInt();
		
		if((Gender == 'm') && (Age >=21 && Age<=60) || (Gender == 'f') && (Age>=18 && Age<=60))
		{
			System.out.println("Your Eligible to marriage");
		}
		else 
		{
			System.out.println("Your Not-Eligible to marriage");
		}
		
	}
}