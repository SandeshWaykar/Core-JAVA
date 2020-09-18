import java.util.Scanner;

class prog19{
  public static void main(String args[])
  {
     Scanner scanner = new Scanner(System.in);
	 
	 System.out.println("Enter value of 'n' : ");
     int n = scanner.nextInt();
     int sum = (n * (n + 1) * (2 * n + 1 )) / 6;
	 System.out.println("Series is = "+sum);
  }
}