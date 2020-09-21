import java.util.Scanner;

class prog27{
	public  static void main(String args[])
	{
	   Scanner sc = new Scanner(System.in);

       System.out.print("Enter size of array : ");

       int size = sc.nextInt();

       int arr[] = new int[size];

       for( int i = 0; i<arr.length; i++ )
		{
			System.out.print("Enter array elements = ");
			arr[i] = sc.nextInt();
		}

       int min = arr[0];
       int max = arr[0];


		for ( int i = 0 ; i<arr.length ; i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}

			if(arr[i] > max)
			{
				max = arr[i];
			}
		}

	   System.out.println("Minimum no in array = "+min);
	   System.out.println("Maximum no in array = "+max);

   }

   }