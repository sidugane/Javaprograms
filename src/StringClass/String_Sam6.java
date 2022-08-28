package StringClass;
import java.util.Scanner;
public class String_Sam6 
       //Exception Handling and String Class practice set
{    // Learning String Classes--practiced on 08/06/2022
public void additon()
{
	int a;
	int b;
	System.out.println("Enter your fevourite number 1 :");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	System.out.println("Enter your fevourite number 2:");
	b=sc.nextInt();
	System.out.println("Addtion of fevourite 1 & fevourite 2 is :"+(a+b));
}

public void substraction()
{
	int a;
	int b;
	System.out.println("Enter your fevourite number 1 :");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	System.out.println("Enter your fevourite number 2:");
	b=sc.nextInt();
	System.out.println("Substraction of fevourite 1 & fevourite 2 is :"+(a-b));	
}

public void multiplication()
{
	int a;
	int b;
	System.out.println("Enter your fevourite number 1 :");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	System.out.println("Enter your fevourite number 2:");
	b=sc.nextInt();
	System.out.println("Multiplication of fevourite 1 & fevourite 2 is :"+(a*b));
}

public void division()
{
	int a;
	int b;
	System.out.println("Enter your fevourite number 1 :");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	System.out.println("Enter your fevourite number 2:");
	b=sc.nextInt();
	System.out.println("Division of fevourite 1 & fevourite 2 is :"+(a/b));
}

public static void main(String[] args)
{
	
	try
	{
		String_Sam6 s6=new String_Sam6();
		s6.additon();
		s6.substraction();
		s6.multiplication();
		s6.division();
	}
	catch(ArithmeticException e)
	{
	System.out.println("Fevourite number 1 can not be divide with 0");	
		
	}
}
}

