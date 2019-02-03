class employee
{
	float salary;
	employee(float sal)
	{
		this.salary = sal;
	}
}
class salaried extends employee
{
	salaried(float sal)
	{
		super(sal);
	}
	void show_salary()
	{
		System.out.println("\nThe salary is "+super.salary);
	}
}
class hourly extends employee
{
	int hrs;
	hourly(float sal,int hrs)
	{
		super(sal);
		this.hrs=hrs;
	}
	void show_salary()
	{
		if(hrs>40)
		{
			super.salary+=(hrs-40)*1000;
		}
		System.out.println("\nThe salary is "+super.salary);
	}
}
class sales extends employee
{
	float comm;
	float sales;
	sales(float sal,float comm,float sales)
	{
		super(sal);
		this.comm=comm;
		this.sales=sales;
	}
	void show_salary()
	{
		super.salary+=(float)(comm/100.0)*sales;
		System.out.println("\nThe salary is "+super.salary);
	}
}
class employee_demo
{
	public static void main(String arg[])
	{
		salaried e1 =new salaried(5000);
		hourly e2=new hourly(5000,50);
		sales e3=new sales(5000,10,4000);
		e1.show_salary();
		e2.show_salary();
		e3.show_salary();
	}
}
