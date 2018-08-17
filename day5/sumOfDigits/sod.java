import java.io.*;
public class sod
{
	static void SumofDigits(int x)
	{
		int b,sum=0;
			while(x!=0)
			{
				b=x%10;
				sum+=b;
				x/=10;
			}
			if(sum/10==0)
				System.out.println("Sum of digits is " +sum+ "");
			else
				SumofDigits(sum);
	}
	
	public static void main(String[] args)
	{
		int n;
		n=Integer.parseInt(args[0]);
		SumofDigits(n);
	}
}
	
	
			