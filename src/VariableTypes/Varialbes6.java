package VariableTypes;

public class Varialbes6 
{
	static int a=10; //Static Global Variable
	
	public static void m1()
	{
		int i=100; //local variable
		System.out.println(i);
	    System.out.println(a);
	}
	
	public void m2()
	{
		
	    int j=200; //local variable
	    System.out.println(j);
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
	
		System.out.println(a);
		m1(); //calling from static method of same class-non static local variable
		Varialbes6 s1=new Varialbes6();
		s1.m2(); //calling from non static method of same class-non static local variable
	}
}

