package VariableTypes;

public class TypeVariable1 
{
// Example of static global variable
	static int b=10; //Global variable
	public static void main(String[] args)
	{
		// Static global variable call from same class
		System.out.println("Static global variable call from same class");
		System.out.println(b); //10 //variable name
		System.out.println("---------------------------");
		
		//static global variable call from diff class
		System.out.println("static global variable call from diff class");
		System.out.println(sample3.c);
		//classname.variablename
	}
	
	public static void m1()
	{
		System.out.println(b);
	}
	public void m2()
	{
		System.out.println(b);
	}
}
