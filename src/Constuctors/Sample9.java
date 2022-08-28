package Constuctors;

public class Sample9
{
	int a; //Global variable declaration
	int b;

	Sample9(int aa, int bb)
	{
		a=aa; //Assigning local variables into global variables
		b=bb;
	}

	public void addition()
	{
		System.out.println("Addition");
		System.out.println(a+b);
		//System.out.println("-------------");
	}

	public void substraction()
	{
		System.out.println("Substraction");
		System.out.println(a-b);
		//System.out.println("-------------");
	}

	public void multiplicaiton()
	{
		System.out.println("Multiplication");
		System.out.println(a*b);
		//System.out.println("-------------");
	}

	public void division()
	{
		System.out.println("Division");
		System.out.println(a/b);
	}
	
public static void main(String[] args)
{
	Sample9 s1=new Sample9(100,200);
	s1.addition();
	s1.substraction();
	s1.multiplicaiton();
	s1.division();
	System.out.println("-------------");
	
	
	Sample9 s2=new Sample9(200,300);
	s2.substraction();
	s2.addition();
	s2.multiplicaiton();
	
	System.out.println("-------------");
	Sample9 s3=new Sample9(500,400);
	s3.division();
	s3.multiplicaiton();
	s3.addition();
	System.out.println("-------------");
	Sample9 s4=new Sample9(1000,108);
	s4.division();
}
}
