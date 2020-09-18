import java.util.Scanner;

class day{
	public static void main(String args[]){
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Number of days : ");
		int days = sc.nextInt();
		
		int year = days/365;
		System.out.println("Total No of Years = "+year);
		
		int month = days/30;
		System.out.println("Total No of Months = "+month);
		
		int week = days/7;
		System.out.println("Total No of Week = "+week);
	
	}

}