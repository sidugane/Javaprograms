package VariableTypes;

public class Variable9
{

	static int i=10;
	
	
	public static void main(String[] args)
	{
		System.out.println("Calling static global variable from same class");
	
	System.out.println(i);	
	
	System.out.println("-------");
	
	m2();
	
	System.out.println("-------");

	Variable9 v9=new Variable9();
	v9.m1();
	
	}
	
	public void m1()
	{
		System.out.println("Calling static global variable-in non static method");
		System.out.println(i);		
	}
	
	public static void m2()
	{
		System.out.println("Calling static global variable-in static method");
		System.out.println(i);	
	}
}

