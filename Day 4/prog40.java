
import java.util.Scanner;
class student
{
	String name;
	int rollno;
	int age;
	int score;
	
	void set(String name, int rollno, int age, int score)
	{
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.score = score;
	}
	
	void show()
	{
		System.out.println(name+" "+rollno+" "+age+" "+score);
	}
}

class prog40
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no of students that you want to add");
		int count = sc.nextInt();
		
		student s1[] = new student[count];
	
		for(int i= 0; i<s1.length; i++)
		{
			System.out.println("\nEnter a Student name");
			String name = sc.next();
			
			System.out.println("\nEnter a Roll No");
			int rollno = sc.nextInt();
			
			System.out.println("\nEnter a Age");
			int age = sc.nextInt();
			
			System.out.println("\nEnter a Score");
			int score = sc.nextInt();
			
			student p = new student();
			p.set(name,rollno,age,score);
			
			s1[i] = p;
			
		}
		
		
		for(int i=0; i<s1.length; i++)
		{
			if(s1[i].score > 0 && s1[i].score <=50)
			{
				System.out.println("grade D!! score between[0-50]");
				s1[i].show();
			}
			else if(s1[i].score > 50 && s1[i].score <=65)
			{
				System.out.println("grade C!! score between[50-65]");
				s1[i].show();
			}
			else if(s1[i].score >65 && s1[i].score <=80)
			{
				System.out.println("grade B!! score between[65-80]");
				s1[i].show();
			}
			else if(s1[i].score > 80 && s1[i].score <=100)
			{
				System.out.println("grade A+!! score between[80-100]");
				s1[i].show();
			}
			else
			{
				System.out.println("\n Enter valid Score!!!");
				s1[i].show();
			}
		}
	
	
	
	}
}