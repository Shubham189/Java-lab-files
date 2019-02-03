import java.util.*;
class complex
{
	int real,img;
	complex()
	{
		this.real=0;
		this.img=0;
	}
	complex(int real,int img)
	{
		this.real=real;
		this.img=img;
	}
	complex add(complex a)
	{
		complex t=new complex();
		t.real=this.real+a.real;
		t.img=this.img+a.img;
		return t;
	}
	complex  sub(complex a)
	{
		complex t=new complex();
		t.real=this.real-a.real;
		t.img=this.img-a.img;
		return t;
	}
	void show()
	{
		System.out.println(this.real+"+i"+this.img);
	}
}
class complex_demo
{
	public static void main(String args[])
	{
		int a,b;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the complex value : ");
		a=sc.nextInt();
		b=sc.nextInt();
		complex A=new complex(a,b);
		complex B=new complex();
		complex C=new complex(2,3); 
		B=A.add(C);
		B.show();
		B=A.sub(C);
		B.show();
	}
}	