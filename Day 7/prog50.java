class Employee
{
	int empid;
	String name;
	public Employee(int empid, String name) 
	{
		super();
		this.empid = empid;
		this.name = name;
	}
	
}
class prog50
{
	public static void main(String[] args)
	{
		Employee e=new Employee(101, "Shubham");
		System.out.println(e);			                                                  
	}
}