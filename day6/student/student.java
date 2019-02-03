 import java.util.*;
class student1 
{
	int roll;
	int age;
	String name;
	int sem;
	int[] marks=new int[3];
	String branch;
	char grade;

	student1(int roll,String name,int age,int sem,String branch,int[] marks,char grade)
	{
		this.roll=roll;
		this.name=name;
		this.age=age;
		this.sem=sem;
		for(int i=0;i<3;i++)
			this.marks[i]=marks[i];
		this.branch=branch;
		this.grade=grade;	
	}
	
	void display()
	{
		System.out.println("roll : "+ roll);
		System.out.println("name : "+ name);		
		System.out.println("age : "+ age);
		System.out.println("Semester : "+ sem);
		System.out.println("Branch : "+ branch);
		System.out.println("Marks : ");
		for(int i=0;i<3;i++)
			System.out.print(marks[i]+" ");
		System.out.println("\nGrade :"+ grade);
	}
	
}
class student
{

public static void main(String args [])
{
	Scanner sc = new Scanner (System.in);
	int r1,a1,num;
	int roll;
	int age;
	String name;
	int sem;
	int[] marks=new int[3];
	String branch;
	char grade;
	System.out.println("enter number of students :");
	num = sc.nextInt();
	student1 s[] = new student1[num];
	
	for(int i=0;i<num;i++)
	{
		System.out.println("Enter the Roll number : ");
		roll=sc.nextInt();
		System.out.println("Enter the Name : ");
		name=sc.next();
		System.out.println("Enter the age: ");
		age=sc.nextInt();
		System.out.println("Enter the Semester : ");
		sem=sc.nextInt();
		System.out.println("Enter the Branch : ");
		branch=sc.next();
		System.out.println("Enter the marks : ");
		for(int j=0;j<3;j++)
			marks[j]=sc.nextInt();
		System.out.println("Enter the grade : ");
		grade=sc.next().charAt(0);
		s[i] = new student1(roll,name,age,sem,branch,marks,grade);
	}

	for(int i=0;i<num;i++)
	{
		System.out.println("\ndetails of student : "+ (i+1));
		s[i].display();
	}	
}
}