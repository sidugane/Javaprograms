package StringClass;
import java.util.Scanner;
public class String_Sam4
{   //Exception Handling and String Class practice set
public static void m2()
{
	int a;  //Try catch exception handling--practiced on 08/06/2022
	int b; //Using Static Method
	
	System.out.println("Enter your 1st number");
	Scanner scr=new Scanner(System.in);
	a=scr.nextInt();
	
	System.out.println("Enter your 2nd number");
	
	b=scr.nextInt();
	System.out.println("The Addition of "+a+" & "+b+" is = "+(a+b));
	System.out.println("The Substraction of "+a+" & "+b+" is  = "+(a-b));
	System.out.println("The Multiplication of "+a+" & "+b+" is  = "+(a*b));
	System.out.println("The Division of "+a+" & "+b+" is = "+(a/b));
} 

public static void main(String[] args)
{
	try
	{
		m2();
	}
	catch(ArithmeticException e)
	{
		System.out.println("Divsion can not be possible with 0");
	}
}
}
