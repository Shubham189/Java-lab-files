import java.util.*;
class Vector
{
	Scanner sc=new Scanner(System.in);
	int []a;
	Vector(int x)
	{
		int i;
		a=new int[x];
		System.out.println("enter the number  ");
		for(i=0;i<x;i++)
			a[i]=sc.nextInt();
	}

	Vector()
	{
		a=new int[99];
	}

	Vector add(Vector abc)
	{
		int i;
		Vector sum=new Vector();
		if(a.length<abc.a.length)
		{
			sum.a=abc.a;
			for(i=0;i<a.length;i++)
			{
				sum.a[i]+=a[i];

			}

		}

		else
		{
			sum.a=a;
			for(i=0;i<abc.a.length;i++)
				sum.a[i]+=abc.a[i];
		}
	return sum;
	}

	public String toString()
	{
		String s="";
		for (int i=0;i<a.length;i++)
			s+=a[i]+" ";
		return s;
	}
}
class vector_demo
{
	public static void main(String []arg)
	{
		Vector p=new Vector(2);
		Vector q=new Vector(4);
		Vector r=new Vector();
		r=p.add(q);
		//r.tostring();
		System.out.println(r);
	}
}