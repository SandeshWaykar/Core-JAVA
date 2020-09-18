
import java.util.Scanner;

class percentage {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your CPP marks");
		double CPP = sc.nextDouble();
		
		System.out.println("Enter your DBT marks");
		double DBT = sc.nextDouble();
		
		System.out.println("Enter your AWEP marks");
		double AWEP = sc.nextDouble();
		
		System.out.println("Enter your MEAN-STACK marks");
		double MS = sc.nextDouble();
		
		System.out.println("Enter your OS marks");
		double OS = sc.nextDouble();
		
		double totalmarks = CPP + DBT +AWEP + MS +OS;
		
		double percentage = (totalmarks/500)*100;
		
		System.out.println("Percentage = "+percentage);
		
	}
}