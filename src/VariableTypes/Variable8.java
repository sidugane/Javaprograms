package VariableTypes;

public class Variable8 
{
public static void main(String[] args)
{
	int a=100;
	int b=200;
	
	System.out.println("Printing Global Variable :"+a);
	System.out.println("Printing Global Variable :"+b);
	
	System.out.println("------");
	System.out.println("Calling static method--same class");
	System.out.println("------");
	m1();
	System.out.println("------");
	System.out.println("Calling Non static Method-Same Class");
	System.out.println("------");
	Variable8 v8=new Variable8();
	v8.m2();
	
	
}

public static void m1()
{
	int i=1000;
	int j=2000;
	System.out.println("Print static local varialbe : "+i);
	System.out.println("Print static local varialbe : "+j);
}

public void m2()
{
	float f1=100.5f;
	double d1=200.5d;
	System.out.println("Print non static local varialbe : "+f1);
	System.out.println("Print non static local varialbe : "+d1);
}
}
