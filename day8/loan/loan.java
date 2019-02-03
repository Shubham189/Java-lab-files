interface personal_loan
{
	float si(float p,int y);
}
class bank1 implements personal_loan
{
	static float intrest_rate=10;

	public float si(float p,int y)
	{
		float si=(p*y*this.intrest_rate/100);
		return si;
	}
}
class bank2 implements personal_loan
{
	static float intrest_rate=15;

	public float si(float p,int y)
	{
		return(p*y*this.intrest_rate/100);
	}
}
class loan
{
	public static void main(String []arg)
	{
		bank1 b1=new bank1();
		System.out.println("\nThe simple intrest of first bank is "+b1.si(1000,2));
		bank2 b2=new bank2();
		System.out.println("\nThe simple intrest of first bank is "+b2.si(1000,2));
	}
}