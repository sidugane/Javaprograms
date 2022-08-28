package ControlStatements;

public class nestedif_15
{
public static void main(String[] args) 
{
	int marks1=98;
	int marks2=100;
	
	if(marks1>60)
	{
		System.out.println("Eligible for SET main exam");
		if(marks2>=95)
		{
			System.out.println("You are cleared SET exma");
		}
		else
		{
			System.out.println("Eligible for SET exam-Score :"+marks1+" Rejectd, Your Mains SET exma Score is: "+marks2);
		}
	}
	else
	{
		System.out.println("Not Eligile for SET exam");
	}
}
}
