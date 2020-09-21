import java.util.Scanner;

class prog26{
	public static void main(String[] args)
	{
		int a[] = {1,1,1,1};
		int b[] = {1,1,1,1};
		int c[] = {1,1,1,1};
		int d[] = {1,1,1,1};
		int e[] = {1};
		
		int size =5;
		int sum = 0;
		int arr[][] = new int[size][];
		
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		arr[3] = d;
		arr[4] = e;
		
		for(int i = 0; i<arr.length; i++)
		{
			for(int j = 0; j<arr[i].length; j++)
			{
				sum = sum + arr[i][j];
			}
		}
		System.out.println(sum);	
	}
}