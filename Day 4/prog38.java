class Employee
{
	private static int empNo;
	private static double salary;
	static double totalSal;
	
	static int counter = 0;
	
	Employee(double salary)
	{
		this.salary = salary;
		
		this.totalSal = totalSal + salary;
		
		empNo = empNo + 1;
		counter = counter + 1;
	}
	
	void show()
	{
		System.out.println("\nTotal Employees ="+empNo);
		System.out.println(" Employee salary ="+salary);
	
		System.out.println("Total salary ="+totalSal);
		System.out.println("Total no of employees = "+counter);
	}
	
	
}

class prog38
{
	public static void main(String args[])
	{
		Employee e1 = new Employee(12000);
		e1.show();
		
		Employee e2 = new Employee(13000);
		e2.show();
		
		Employee e3 = new Employee(10000);
		e3.show();
		//e3.totalSal();
		
	}
}