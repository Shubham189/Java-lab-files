import java.io.*;
class triangle
{
	float base,height;
	void set_dim(float base,float height)
	{
		this.base=base;
		this.height=height;
	}
	float find_area()
	{
		return (float)0.5*base*height;
	}
}
public class tri_demo
{
	public static void main(String[] args)
	{	
		float a,b;
		a=Float.parseFloat(args[0]);
		b=Float.parseFloat(args[1]);
		triangle tri=new triangle();
		tri.set_dim(a,b);
		float area=tri.find_area();
		System.out.println("\nArea="+area);
	}
}	
