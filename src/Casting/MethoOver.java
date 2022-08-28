package Casting;

public class MethoOver
{
//Method Overloading--->Compile time Polymorphism-->Early Binding-->Static Binding
	
	public static void main(String[] args) 
	{
		
		MethoOver ma=new MethoOver();
		ma.a(10, 20);
		ma.a("Sidharth", "Tanuja");
	}
	
	
	void a(int a, int b)
	{
		System.out.println("The Ingeger values from a() method is "+a+" & "+b);
	}
	
	void a(String s,String t)
	{
		System.out.println("The String values from a() method is "+s+" & "+t);
	}
}
/*Acquiring super class method into sub class with the help of extends keyword
and changing implementation/ definition according to subclass specification is called
as method overriding*/