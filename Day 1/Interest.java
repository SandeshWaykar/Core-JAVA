import java.util.Scanner;

class Interest{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter principle amount");
		double principle = sc.nextDouble();
		
		System.out.println("Enter Interest Rate");
		double InterestRate = sc.nextDouble();
		
		System.out.println("Enter Time");
		double time = sc.nextDouble();
		
		double SimpleInterest = (principle * InterestRate * time)/100;
		System.out.println("The Simple Interest = "+SimpleInterest);
	
	}

}