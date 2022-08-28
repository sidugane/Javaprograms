package Constuctors;

public class Sample5
{

	int num3; //Declaration of global variables
	int num4;
	int num5;
	
	Sample5() //User defined Constructor--->without parameter
	{
		num3=25; //Initialization of global variables
		num4=52;
		num5=num3+num4;
	}
	
	public static void main(String[] args)
	{
	
		//Calling global variables from diff class using constructors
		
		Sample4 s4=new Sample4();
		s4.con1(); 
		
		Sample5 s5=new Sample5(); //calling method m1 from same class
		s5.m1();
	}
	
	public void m1()
	{
		System.out.println("Calling Method m1 from same class :"+num5);
	}
}
