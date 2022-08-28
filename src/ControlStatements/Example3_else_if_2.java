package ControlStatements;

public class Example3_else_if_2 
{
public static void main(String[] args)
{
int marks=55;
if(marks>=65)
{
	System.out.println("Distinction");
}
else if(marks>=60 & marks<=64)
{
	System.out.println("1st Class");
}
else if(marks>=50 & marks<=59)
{
 System.out.println("Second Class");
}
else if(marks>=35 & marks<=49)
{
	System.out.println("Pass");
}
else
{
	System.out.println("Fail");
}
}
}
