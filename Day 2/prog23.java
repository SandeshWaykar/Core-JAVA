import java.util.Scanner;

class prog23{
  public static void main(String args[])
  {
    int arr[] = new int [] {10,20,30,40,50};
	System.out.println("User Array : ");
	
	for(int i=0; i<arr.length; i++)
	{
		System.out.println(arr[i]+ " ");
	}
	
	System.out.println("Reverse of Array : ");
	
	for(int i = arr.length-1; i>=0; i--)
	{
		System.out.println(arr[i]+ " ");
	}
	
  }
}