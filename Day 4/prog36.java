class mathOpe
{
		void multiply(int a , int b)
		{
			int c = a * b;
			System.out.println("multipication of two integers= "+c);
		}
		
		void multiply(float p , float q, float r )
		{
			float t = p * q * r;
			System.out.println("multipication of float = "+t);
		}
		
		void multiply(double a , int b)
		{
			double s = a * b;
			System.out.println("multipication of double and int = "+s);
		}
		
		void multiply(int arr[])
		{
			int multi = 1;
			for(int i = 0; i<arr.length; i++)
			{
				multi = multi * arr[i];
			}
			System.out.println("multipication of array = "+multi);
		}
		
		
	
}

public class Multiply
{
	public static void main(String[] args)
	{
		mathOpe m = new mathOpe();
		m.multiply(10,5);
		m.multiply(2.5f, 3.5f, 4.5f);
		m.multiply(5.77, 10);
		
		int arr[] = {5,3,4,2};
		m.multiply(arr);
		
		

	}
}