import java.io.*;
class pal
{
	public static void main(String[] args)
	{
		int n,c,a,b,rev=0;
		n=Integer.parseInt(args[0]);
		c=n;
		while(c!=0)
		{
			b=c%10;
			c=c/10;
			rev=b+(rev*10);
		}
		if(n==rev)
			System.out.println("\nPalindrome!!");
		else
			System.out.println("\nNot Palindrome!!");
	}
}	
