package VariableTypes;

public class v1 
{
int c=30; //Global Variable
public void m1()
{
	int a=10; //Local Variable
	System.out.println(a);
	System.out.println(c);
}

public void m2()
{
	int b=20; //Local Variable
	System.out.println(b);
	System.out.println(c);
}

public static void main(String[] args)
{
	v1 s1=new v1();
	s1.m1();
	s1.m2();
	
	System.out.println("Non-Static Variable Value");
	System.out.println(s1.c);
}
}
