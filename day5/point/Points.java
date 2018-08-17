import java.io.*;
class point{
	int x,y,z;
	point(int a,int b,int c){
		x=a;
		y=b;
		z=c;
	}
	void dis_or(){
		double d = (x*x)+(y*y)+(z*z);
		double o = Math.sqrt(d);
		System.out.println("Distance from origin : "+o);
	}
	void dis_poi(int x1,int y1,int z1){
		double d = ((x-x1)*(x-x1))+((y-y1)*(y-y1))+((z-z1)*(z-z1));
		double o = Math.sqrt(d);
		System.out.println("Distance from origin : "+o);
	}
	void point1(point a){
		double d = ((this.x-a.x)*(this.x-a.x))+((this.y-a.y)*(this.y-a.y))+((this.z-a.z)*(this.z-a.z));
		double o = Math.sqrt(d);
		System.out.println("Distance from point : "+o);
	}
	void equal(point a){
		double d = ((this.x-a.x)*(this.x-a.x))+((this.y-a.y)*(this.y-a.y))+((this.z-a.z)*(this.z-a.z));
		double o = Math.sqrt(d);
		if(o==0)
		System.out.println("Equal");
	}
}
public class Points{
	public static void main(String args[]){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int d = Integer.parseInt(args[3]);
		int e = Integer.parseInt(args[4]);
		int f = Integer.parseInt(args[5]);
		point p1 = new point(a,b,c);
		point p2 = new point(d,e,f);
		p1.dis_or();
		p1.dis_poi(5,7,2);
		p1.point1(p2);
		p1.equal(p2);
	}
}