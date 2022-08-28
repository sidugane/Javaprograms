package ControlStatements;

public class Nested_If_Statement_4
{
public static void main(String[] args)
{
int prelims=61;
int mains=94;
comparisoin(); //calling regular not static method from same class
System.out.println("-------------------------------");
if(prelims>60)
{
	System.out.println("Eligible for main exam");
	if(mains>=95)
	{
		System.out.println("You are selected");
	}
	else
	{
		System.out.println("Eligible for main exam-Score :"+prelims+" Rejectd, Your Mains Score is: "+mains);
	}
}
else
{
	System.out.println("Not Eligile for main exam");
}
}

public static void comparisoin()
{
	// In below example if the first condition is true then it will execute outer If statement &
	//then checks the inner If statement...If Outer If condition fails it will directly executes
	//the Outer Else statement & ignore the checking of inner if else statements.
	int a=90;
	int b=80;
	if(a>b)
	{
		System.out.println("Calling Non-Static Regular Method From Same Class");
		System.out.println("Output a>b : "+a);
		if(a==b)
		{
			System.out.println("Both values are Same :"+a+" & "+b);
		}
		else
		{
			System.out.println("Nothing");
		}
	}
	else
	{
		System.out.println("Calling Non-Static Regular Method From Same Class");
		System.out.println("Output b>a : "+b);
	}
}
}
