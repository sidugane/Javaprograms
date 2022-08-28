package ControlStatements;

public class SwitchCase1
{
public static void main(String[] args)
{
	
//Switch Case used when we have to make a choice between no.of alternatives for a given variable.
	
	System.out.println("Ouput from Regular Static Method-Different Class:");
	SwitchCase4.switchcasestudy();//Regular Static Method-Different Class
	System.out.println("----------------------------");
switch(7)
{
case 1:
	System.out.println("This is--> Monday");
	break;
case 2:
	System.out.println("This is--> Tuesday");
	break;
case 3:
	System.out.println("This is--> Wednesday");
	break;
case 4:
	System.out.println("This is--> Thursday");
	break;
case 5:
	System.out.println("This is--> Friday");
	break;
case 6:
	System.out.println("This is--> Saturday");
	break;
case 7:
	System.out.println("This is--> Sunday");
	break;
	default:
		System.out.println("Wrong selection");
}
}
}
