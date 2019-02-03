import java.lang.*;
class NegetiveAmountException extends Exception
{
	NegetiveAmountException()
	{
		super();
	}
	public String toString()
	{
		return ("Not enough balance!!");
	}
}
class MinimumAmountException extends Exception
{
	MinimumAmountException()
	{
		super();
	}
	public String toString()
	{
		return ("Minimum balance violated!!");
	}
}
class account
{
	int account_number;
	float balance;
	account()
	{
		account_number=0000;
		balance=0;
	}
	account(int a,float b)
	{
		account_number=a;
		balance=b;
	}
	void deposit(float amount) throws NegetiveAmountException
	{
		if(amount<0)
			throw new NegetiveAmountException();
		else
			balance+=amount;
	}
	void withdrawl(float amount) throws MinimumAmountException
	{
		if(balance-amount<0)
			throw new MinimumAmountException();
		else
			balance-=amount;
	}
	void show()
	{
		System.out.println("\nThe balance is : "+balance);
	}
}
class account_demo
{
	public static void main(String arg[])
	{
		account a=new account(0001,1000);
		try
		{
			//a.deposit(-100);
			a.deposit(100);
			//a.withdrawl(10000);
			a.withdrawl(100);
			a.show();
		}
		catch(NegetiveAmountException e)
		{
			System.out.println(e);
		}
		catch(MinimumAmountException e)
		{
			System.out.println(e);
	}
	}
}