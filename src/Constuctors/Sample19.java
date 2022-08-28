package Constuctors;

public class Sample19 
{
	int a; //Global variable declaration
	int b;

	Sample19(int aa, int bb)
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
	Sample19 s1=new Sample19(110,220);
	s1.addition();
	s1.substraction();
	s1.multiplicaiton();
	s1.division();
	System.out.println("-------------");
	
	
	Sample19 s2=new Sample19(320,540);
	s2.substraction();
	s2.addition();
	s2.multiplicaiton();
	
	System.out.println("-------------");
	Sample19 s3=new Sample19(550,600);
	s3.division();
	s3.multiplicaiton();
	s3.addition();
	System.out.println("-------------");
	Sample19 s4=new Sample19(900,1008);
	s4.division();
}

}
