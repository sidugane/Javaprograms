package Constuctors;

public class Sample12
{
	int a;  //declaring global variables
	int b;

	Sample12() //User defined constructor--->Without parameter
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

	public void Division()
	{
		System.out.println("Division");
		System.out.println(a/b);
		System.out.println("---------");
	}

	public static void main(String[] args) 
	{
		Sample12 s1=new Sample12();
		s1.addition();
		
		Sample12 s2=new Sample12();
		s2.Division();
	}
}
