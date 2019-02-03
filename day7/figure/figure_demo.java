abstract class figure
{
		double dim1;
		double dim2;
		figure(double a, double b)
		{
				dim1=a;
				dim2=b;
		}
		abstract void area();
}
class rectangle extends figure
{
		double area;
		rectangle(double a, double b)
		{
				super(a,b);
		}
		void area()
		{
				this.area=super.dim1*super.dim2;
		}
		void show()
		{		this.area();
				System.out.println("\nThe area of triangle is : "+this.area);
		}
}
class triangle extends figure
{
		double area;
		triangle(double a, double b)
		{
				super(a,b);
		}
		void area()
		{
				this.area=super.dim1*super.dim2*0.5;
		}
		void show()
		{		this.area();
				  System.out.println("\nThe area of triangle is : "+this.area);
		}
}
class figure_demo
{
		public static void main(String arg[])
		{
			rectangle r= new rectangle(5,6);
			triangle t=new triangle(5,6);
			r.show();
			t.show();
		}
}
