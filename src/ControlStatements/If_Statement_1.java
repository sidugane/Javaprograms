package ControlStatements;

public class If_Statement_1
{
public static void main(String[] args) 
{
	If_ElseIF_Else();// Calling from If_ElseIF_Else()
	
	//Practice-Normal If_Else Statement
int marks=33;
if(marks>35)
{
	System.out.println("You are: Pass");
}
else
{
	System.out.println("You are : Fail");
}
}


public static void If_ElseIF_Else()
{
	int a=59;
	if(a==35)
	{
		System.out.println("Your Result is : Pass");
	}
	else if(a>35 & a<60)
	{
		System.out.println("Your Result is : Pass-First Class");
	}
	else
	{
		System.out.println("Your Result is : Fail");
	}
}

}



