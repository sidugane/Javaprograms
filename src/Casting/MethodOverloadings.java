package Casting;

public class MethodOverloadings 
{
public static void main(String[] args)
{
	MethodOverloadings m=new MethodOverloadings();


System.out.println("m1");
System.out.println("");

m.m1(20, 30);

System.out.println("m2");
System.out.println("");
m.m1(20,40, 60);
}

public void m1(int a, int b)
{
	/*
	 * a=10; b=20;
	 */
	
	System.out.println("m1 "+(a+b));
}

public void m1(int a,int b,int c)
{
	
	/*
	 * a=20; b=30; c=a+b;
	 */
	System.out.println("m2 "+c);
}
}
/* Declaring multiple methods with the same name but with different arguments/parameters
inputs in same class is called method overloading */

/*If a class has multiple methods having same name but different in parameters, 
 it is known as Method Overloading.if we have to perform only one operation, 
 having same name of the methods increases the readability of the program.

Suppose you have to perform addition of the given numbers but there can be any number of 
arguments, if you write the method such as a(int,int) for two parameters, 
and b(int,int,int) for three parameters then it may be difficult for you
 as well as other programmers to understand the behavior of the method
  because its name differs.*/