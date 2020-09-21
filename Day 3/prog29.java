import java.util.Scanner;

class prog29
{
	public static void main(String args[])
	{
	Scanner sc = new Scanner(System.in);
	int arr[][] = new int [3][3];
	
	int i,j;
	int count_arr = 0;
	int count_ele = 0;
	
	System.out.println("Enter Elements : ");
	
	for(i=0; i<3; i++)
	{
		for(j=1; j<3; j++)
		{
			arr[i][j] = sc.nextInt();
			count_ele++;
		}
		count_arr++;
	}
	System.out.println("1D array : "+count_arr+ "\nElements : "+count_ele);
	}
}