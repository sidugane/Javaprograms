package ControlStatements;
import java.util.Scanner;
public class Elseifstatement_3 
{
public static void main(String[] args) 
{
	System.out.println("Enter Your Age: ");
	int age;
	Scanner ag=new Scanner(System.in);
	age=ag.nextInt();
	
	if(age>18 & age<25)
	{
		System.out.println("You are 18+");
	}	
	else if(age>25 & age<35)
	{
		System.out.println("You are 25+");
	}
	else if(age>35 & age<75)
	{
		System.out.println("You are 35+");
	}
	else if(age>75 & age<=100)
	{
		System.out.println("You are 75+");
	}
	else
	{
		System.out.println("Your Minor");
	}
}
}
