class Employee1
{
	int empid;
	String name;
	public Employee1(int empid, String name) 
	{
		super();
		this.empid = empid;
		this.name = name;
	}
	@Override  //annotation
	public String toString() //  here we have overridden the toString method 
	{
		return "Employee [empid=" + empid + ", name=" + name + "]";
	}
	
	
}
class prog50a
{
	public static void main(String[] args)
	{
		Employee1 e=new Employee1(101, "Shubham");
		System.out.println(e);		
	}
}