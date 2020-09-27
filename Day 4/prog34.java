import java.util.Scanner;

class circle
{
	private int r;
	private double area;
	
	void firstInit(int r)
	{
		this.r = r;
	}
	
	void area()
	{
		area = 3.14*(r * r);
		
	}
	
	void show()
	{
		System.out.println("Area of Circle = "+area);
	}
} 

class prog34
{
	public static void main(String[] args)
	{
		circle c = new circle();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius");
		int x = sc.nextInt();
		c.firstInit(x);
		c.area();
		c.show();	
	}
}