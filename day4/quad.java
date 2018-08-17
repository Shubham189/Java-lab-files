import java.util.*;
public class quad
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double a,b,c;
		System.out.println("Enter the coefficients of a quadratic equation : ");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		double d;
		d=(b*b-4*a*c);
		if(d<0)
			System.out.println("Imaginary roots");
		else if(d==0){
			System.out.println("Equal roots");
			System.out.println("The root is : "+(-1*b/(2.0*a)));
		}	
		else {
			System.out.println("Distinct roots");
			double r1,r2;
			r1= (-b+ Math.sqrt(d)/(2*a));
			r2= (-b- Math.sqrt(d)/(2*a));
			System.out.println("The roots are : "+r1+" "+r2);
		}	
	}
}