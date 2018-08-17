public class Bin
{
	public static void main(String args[])
	{
		int bin=0;
		int x=Integer.parseInt(args[0]);
		while(x!=0)
		{
			bin=bin*10+(x%2);
			x/=2;
		}
		System.out.println("The equivalent binary form is : "+bin);
	}	
}
	