class person
{
	private int age;
	private String name;
	
	person()
	{
		this.age = 18;
		System.out.println("Default age = "+age);
	}
	
	person(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	
	void show()
	{
		System.out.println("person age is = "+age);
		System.out.println("person Name is = "+name);
	}
}

public class prog37
{
	public static void main(String[] args)
	{
		person p = new person();
		
		person p1 = new person(23,"Sandesh");
		p1.show();	
	}
}