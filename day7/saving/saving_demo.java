class saving_account
{
	static double annual_int_rate;
	private double saving_bal;
	saving_account(double r,double bal)
	{
		annual_int_rate=r;
		saving_bal=bal;
	}
	double monthly_intrest()
	{
		double balance;
		balance=(saving_bal*annual_int_rate)/12+saving_bal;
		return balance;
	}
	static void newrate(double y)
	{
		annual_int_rate=y;
	}
}
class saving_demo
{
	public static void main(String arg[])
	{
		saving_account obj=new saving_account(4.0,5000);
		System.out.println("\nThe balance is "+obj.monthly_intrest());
		obj.newrate(5);
		System.out.println("\nThe balance is "+obj.monthly_intrest());
	}
}
