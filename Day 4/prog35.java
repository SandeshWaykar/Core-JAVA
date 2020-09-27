import java.util.Scanner;

class cal
{
	static int add(int b, int c)
	{
		int x = b + c;
		System.out.println("addition = "+x);
		return x;
	}
	
	static int substract(int a, int b)
	{
		int s = a - b;
		System.out.println("Substraction = "+s);
		return s;
	}
	
	static int multiply(int a, int b)
	{
		int m = a * b;
		System.out.println("multipication = "+m);
		return m;
	}
	
	static int power(int x, int y)
	{
		int p = 1;
		for(int i = 0; i< y; i++)
		{
			p *= x;
		}
		System.out.println("power = "+p);
		return p;
	}
	
}

public class prog35
{
	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter input number");
	int res = sc.nextInt();
	
	System.out.println("Enter input number");
	int res1 = sc.nextInt();
	
	cal ca = new cal();
	ca.add(res, res1);
	ca.substract(res, res1);
	ca.multiply(res, res1);
	ca.power(res, res1);
	
	}
	
}

