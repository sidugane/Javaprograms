package VariableTypes;

public class Variable10 
{
	
	
public static void main(String[] args) 
{
	System.out.println("Calling Static Global Variable from diff class");
	System.out.println("Syntax :- CalssName.VariableName");
	System.out.println(Variable11.a); //CalssName.VariableName
	System.out.println("---");
	System.out.println(Variable11.b); //CalssName.VariableName
	System.out.println("---");
	System.out.println(Variable11.c); //CalssName.VariableName
	
	System.out.println("Calling static veriable from same class");
	System.out.println("Static Method");
	
	v1(); //calling 
	
	System.out.println("Calling non static veriable from same class");
	System.out.println("Non-Static Method");
	
	Variable10 v10=new Variable10();
	v10.v2();
}


public static void v1()
{
	int a=10;
	int b=20;
	int c=a+b;
	System.out.println(c);
}

public void v2()
{
	int i=100;
	int j=200;
	int k=i*j;
	System.out.println(k);
}
}
