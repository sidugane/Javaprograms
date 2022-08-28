package ControlStatements;

public class Nestedif_14 
{
public static void main(String[] args)
{
	int prelims=61;
	int mains=97;
	
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
}
