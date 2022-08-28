package Constuctors;

public class demo1
{
int a;

demo1(int b)
{
	a=b;
}

public void m2()
{
	System.out.println("The value of a is :"+a);
}

public static void main(String[] args)
{

	demo1 s1=new demo1(100);
	s1.m2();
	
	demo1 s2=new demo1(500);
	s2.m2();
	
	
	demo3 s3=new demo3(1000);
	s3.m2();
}
}
