package Constuctors;

public class Sample11
{
	int a;  //declaring global variables
	int b;

	Sample11() //User defined constructor--->Without parameter
	{
		a=120; //Initialization of global variables
		b=310;
	}

	public void addition()
	{
		System.out.println("Additon");
		System.out.println(a+b);
		System.out.println("---------");
	}

	public void Substraction()
	{
		System.out.println("Substractions");
		System.out.println(a-b);
		System.out.println("---------");
	}

	public static void main(String[] args)
	{
		Sample11 s1=new Sample11();
		s1.addition();
		
		Sample11 s2=new Sample11();
		s2.Substraction();
	}
}
