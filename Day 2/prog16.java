
import java.util.Scanner;

class prog16{
	public static void main(String args[]){
		int i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a No");
		int A = sc.nextInt();
		
		for(i=1; i<=10; i++)
		{
			System.out.println(A+ "*" +i+ "=" +A*i);
		}
		
	}
}