
import java.util.Scanner;

class prog17{
  public static void main(String args[])
  {
    int a, n, res = 0;

    System.out.println("Enter an integer to reverse");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();

    while(n != 0)
    {
		a=n%10;
		res=(res*10)+a;
		n=n/10;
    }

    System.out.println("Reverse number is " +res);
  }
}