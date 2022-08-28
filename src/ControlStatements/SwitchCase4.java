package ControlStatements;

public class SwitchCase4 
{
public static void main(String[] args)
{
	//Switch Case used when we have to make a choice between no.of alternatives for a given variable.	
	
	switchcasestudy(); //Static regular method switchcasestudy() calling from same class
}

public static void switchcasestudy()
{
	switch(5)
	{
	case 1 :
		System.out.println("Your are in Case 1");
		break;
	case 2 :
		System.out.println("Your are in Case 2");
		break;
	case 3 :
		System.out.println("Your are in Case 3");
		break;
	case 4 :
		System.out.println("Your are in Case 4");
		break;
				
	case 5 :
		System.out.println("Your are in Case 5");
		break;
	case 6 :
		System.out.println("Your are in Case 6");
		break;
	case 7 :
		System.out.println("Your are in Case 7");
		break;
		default:
			System.out.println("Wrong Input");
					
	}
}




}
