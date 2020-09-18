import java.util.Scanner;

class swapNo{
	public static void main(String args[]){
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number A");
		int a = sc.nextInt();
		
		System.out.println("Enter no B");
		int b = sc.nextInt();
		
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("After swapping : a = " +a+ "b = "+b);
	
	}

}