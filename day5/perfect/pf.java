import java.io.*;
class pf
{
	public static void main(String[] args)
	{
		int n,i,sum=0;
		n=Integer.parseInt(args[0]);
		
		for(i=1;i<n;i++)
		{
				if(n%i==0)
					sum+=i;
		}		
		if(n==sum)
			System.out.println("\nPerfect!!");
		else
			System.out.println("\nNot perfect!!");
	}
}	
