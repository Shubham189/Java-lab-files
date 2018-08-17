import java.util.*;
class Num{
	int value;
	void set_value(int x){
		value = x;
	}
	boolean is_Even(){
		if(value%2==0)
			return true;
		else 
			return false;
	}
	boolean prime(){
		int i,m=value/2,flag=0;
		for(i=2;i<=m;i++){
			if(value%i==0)
				flag = 1 ;
		}
		if(flag==0)
			return true;
		else
			return false;
	}
	boolean perfect(){
		int temp=0,i;
		for(i=1;i<=value/2;i++){
			if(value%i==0){
				temp+=i;
			}
		}
		if(temp==value)
			return true;
		else
			return false;
	}
	int fin_fact(){
		int i,f=1;
		for(i=1;i<=value;i++)
			f = f*i;
		return f;
	}
}
public class NumDemo{
	public static void main(String args[]){
		Num n1 = new Num();
		int a = Integer.parseInt(args[0]);
		n1.set_value(a);
		if(n1.is_Even())System.out.println("Even Number");
		if(n1.prime())System.out.println("Prime Number");
		if(n1.perfect())System.out.println("Perfect Number");
		int x = n1.fin_fact();
		System.out.println("Factorial is : "+x);
	}
}