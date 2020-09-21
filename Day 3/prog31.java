 class Student
 {
	 private int age ;
     private String name;

   void setData(int a, String n)
    {
		age = a;
		name = n ;
	}

   void show()
	{
	System.out.println("\nAge = "+age);
    System.out.println("Name = "+name);
	}
}

public class prog31
{
	public static void main(String args[])
	{
	 Student s1 = new Student();
	 Student s2 = new Student();

     s1.setData(87,"Rohan");
	 s1.show();

     s2.setData(119,"Dinesh");
	 s2.show();
    }
}
