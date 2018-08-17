import java.io.*;
class triangle
{
	float base,side1,side2,area,peri;
	void set_dim(float base,float side1,float side2)
	{
		this.base=base;
		this.side1=side1;
		this.side2=side2;
	}
	boolean is_triangle()
	{
		if((side1+side2>base) && (side2+base>side1) && (base+side1>side2))
			return true;
		else
			return false;
	}	
	void find_area()
	{
		float s;
		s=(side1+side2+base)/2;
		this.area=(float)Math.sqrt(s*(s-side1)*(s-side2)*(s-base));
	}
	void find_perimeter()
	{
		this.peri=(float)base+side1+side2;
	}
	void show()
	{
		this.find_area();
		this.find_perimeter();
		System.out.println("\nArea="+this.area);
		System.out.println("\nPerimeter="+this.peri);
	}	
}
public class tri_demo
{
	public static void main(String[] args)
	{	
		float a,b,c;
		a=Float.parseFloat(args[0]);
		b=Float.parseFloat(args[1]);
		c=Float.parseFloat(args[2]);
		triangle tri=new triangle();
		tri.set_dim(a,b,c);
		if(tri.is_triangle())
		{
			tri.show();
		}
		else
			System.out.println("\nCant be a Triangle!");	
	}
}	
