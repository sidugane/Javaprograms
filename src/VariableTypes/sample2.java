package VariableTypes;

public class sample2
{
static int a=100; //static global variable
static int b=200;
	
	public static void main(String[] args)
	{
		int a1=500; 
		int b1=1000;
		
		System.out.println("Static Global Variable :"+a);
		System.out.println("Static Global Variable :"+b);
		System.out.println("------------");	
		System.out.println("Local Variable :"+a1);
		System.out.println("Local Variable :"+b1);
	}
}
