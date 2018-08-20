import java.io.*;
class prog4
{
	public static void main(String[] args)
	{
		int n,i,a,c=0,x,y=1,sum=0;
		n=Integer.parseInt(args[0]);
		a=n;
		while(a!=0)
		{
			a/=10;
			c++;
		}
		a=n;
		while(a!=0)
		{
			x=a%10;
			for(i=0;i<c;i++)
			{
				y*=x;
			}
			sum+=y;
			y=1;
			a/=10;
		}
		if(sum==n)
			System.out.println("\nArmstrong!");
		else
			System.out.println("\nNot a Armstrong!");
	}
}
