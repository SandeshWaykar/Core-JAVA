 import java.util.Scanner;

class prog28{
     public static void main(String args[])
		{

     System.out.print("How many students you want to enter = ");

     Scanner sc = new Scanner(System.in);

      int size = sc.nextInt();

	String array[] = new String[size];

	for(int i= 0 ; i <array.length ; i++ )
	{
		array[i] = sc.nextLine();
	}

     System.out.println("Elements in array are");

	for(String str : array)
	{
		System.out.print(str + "  ");
	}

 }
 }