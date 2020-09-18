
import java.util.Scanner;

class greater{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no X");
		int x = sc.nextInt();
		
		System.out.println("Enter no Y");
		int y = sc.nextInt();
		
		System.out.println("Enter no Z");
		int z = sc.nextInt();
		
		if(x>y && x>z)
		{
			System.out.println(" X is greater no ");
		}
		else if(y>x && y>z)
		{
			System.out.println(" Y is greater no ");
		}
		else
		{
			System.out.println(" Z is greater no ");
		}

			System.out.println("Using Ternery/ Conditional operator");
			
			int num = (x>y) ? x : y;
			int num1 = (z>num)? z : num;
			System.out.println("Greater No = "+num1);

	}
} 
