import java.util.Scanner;

class HRA{
	public static void main(String args[]){
		
	Scanner sc = new Scanner(System.in);
	  
	System.out.println("Enter basic salary");
	double sal = sc.nextDouble();
	
	System.out.println("Enter DA");
	double da = sc.nextDouble();
	
	System.out.println("Enter HRA");
	double hra = sc.nextDouble();
	
	double da1 = (da*sal)/100;
	double hra1 = (hra*sal)/100;
	
	double GS = (sal+da1+hra1);
	
	System.out.println(" Gross Salary is = "+GS);
	}
}