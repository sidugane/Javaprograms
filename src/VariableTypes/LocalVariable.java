package VariableTypes;

public class LocalVariable 
{
    int c=30; //Global variable
    
	public void m1()
	{
		int a=20; //Local Variable
		System.out.println(a);
		System.out.println(c);
	}
	
	public static void m2()
	{
		int b=40; //Local Variable
		System.out.println(b);
		
	}
	
	public static void main(String[] args)
	{
	
		System.out.println("Calling variables from methods");
		LocalVariable s1=new LocalVariable();
		System.out.println("Calling Non-Static Method");
		s1.m1();
		System.out.println(s1.c);
		System.out.println("Calling Static Method");
		m2();
	
		
		
	}
	
}
