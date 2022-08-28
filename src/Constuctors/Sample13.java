package Constuctors;

public class Sample13 
{
	int a;  //declaring global variables
	int b;

	Sample13() //User defined constructor--->Without parameter
	{
		a=440; //Initialization of global variables
		b=310;
	}

	public void addition()
	{
		System.out.println("Additon");
		System.out.println(a+b);
		System.out.println("---------");
	}

	public void multiplication()
	{
		System.out.println("multiplication");
		System.out.println(a*b);
		System.out.println("---------");
	}
	
	public static void main(String[] args)
	{
		Sample13 s1=new Sample13();
		s1.addition();
		s1.multiplication();
	}
}
