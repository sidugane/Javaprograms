package Casting;

public class MethoOverLoading 
{
public static void main(String[] args)
{
	MethoOverLoading a=new MethoOverLoading();
	a.method1(100, 200);
	a.method1("Sidharth", "Ajay");
}


void method1(int a ,int b)
{
	System.out.println("Method1-Integer-The values of a and b are:"+a+" & "+b);
}

void method1(String s,String s1)
{
	System.out.println("Method1-String-String method "+s+" & "+s1);
	
}
}

/* Declaring multiple methods with the same name but with different arguments/parameters
inputs in same class is called method overloading */
