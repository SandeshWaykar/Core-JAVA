class Employee
{
	private int rollNo;
	private String name;
	
	Employee(int rollNo, String name)
	{
		this.rollNo = rollNo;				//this keyword 
		this.name = name;
	}
	
	void show()
	{
		System.out.println(rollNo+ " " +name);
	}
}

public class prog33
{
	public static void main(String[] args)
	{
		Employee e = new Employee(86, "Sandesh");
		e.show();
	
		Employee e1 = new Employee(201, "Sandy");
		e1.show();
	}
}