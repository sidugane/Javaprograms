package ControlStatements;
import java.util.Scanner;
public class SwitchCase7 
{

public static void main(String[] args)
{
System.out.println("Enter Your Case Number :");
Scanner a1=new Scanner(System.in);
int a;
a=a1.nextInt();

switch(a)
{
case 1:
	System.out.println("We are in case 1");
	System.out.println("Thanks for choosing this...");
	break;
case 2:
	System.out.println("We are in case 2");
	System.out.println("Thanks for choosing this...");
	break;	
case 3:
	System.out.println("We are in case 3");
	System.out.println("Thanks for choosing this...");
	break;
case 4:
	System.out.println("We are in case 4");
	System.out.println("Thanks for choosing this...");
	break;
case 5:
	System.out.println("We are in case 5");
	System.out.println("Thanks for choosing this...");
	break;
case 6:
	System.out.println("We are in case 6");
	System.out.println("Thanks for choosing this...");
	break;
case 7:
	System.out.println("We are in case 7");
	System.out.println("Thanks for choosing this...");
	break;
	default:
		System.out.println("You Are Entered Wrong Input!");
}
	
}
}
