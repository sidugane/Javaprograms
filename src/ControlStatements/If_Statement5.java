package ControlStatements;
import java.util.Scanner;
public class If_Statement5
{
public static void main(String[] args) 
{
	int a=20;            //Addition of two numbers
	int b=30;
	int sum=a+b;
	System.out.println("Output 1:");
	System.out.println("The sum of a+b is "+sum);
	System.out.println("--------------------------");
	System.out.println("Output 2:");
	input1(); //Calling regular static method from same class
}


//Creating Regular Static Method
public static void input1()
{
System.out.println("Enter your value");	
int aa;
Scanner sc111=new Scanner(System.in);//Creating Object for taking input from Keyboard
aa=sc111.nextInt();//Calling Object
if(aa>18)
{
	System.out.println("Your are 18+");
}
else
{
	System.out.println("Your are Minor");
}
}
}


