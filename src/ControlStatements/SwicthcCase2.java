package ControlStatements;
import java.util.Scanner;
public class SwicthcCase2 
{
public static void main(String[] args) 
{
	System.out.println("Enter your Name");
	Scanner sc1=new Scanner(System.in);   
	String sa=sc1.nextLine();
	System.out.println("Hello! "+sa);
	
	System.out.println("Enter your option number:");
    Scanner sc2=new Scanner(System.in);
    int a=sc2.nextInt();
    
	switch(a)
	{
	    case 1: System.out.println("This is case 1");
	    break;
		case 2: System.out.println("This is case 2");
	    break;
		case 3: System.out.println("This is case 3");
	    break;
		case 4: System.out.println("This is case 4");
	    break;
		case 5: System.out.println("This is case 5");
	    break;
		case 6: System.out.println("This is case 6");
	    break;
		case 7: System.out.println("This is case 7");
	    break;
	    default:System.out.println("Wrong Input");
	}
}
}