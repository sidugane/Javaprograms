package ControlStatements;
import java.util.Scanner;
public class SwitchCase5
{
public static void main(String[] args)
{
	System.out.println("Enter Case No:");
	int age;
	Scanner age1=new Scanner(System.in);
	age=age1.nextInt();
	switch(age)
	{
	case 1:
	     {
		System.out.println("Your are 18+");
	    }
		break;
	case 2:
		{
		System.out.println("Your are between 18-30");
	    }
		break;	
	case 3:
	{
	System.out.println("Your are between 30-50");
    }
	break;	
		default:
			System.out.println("Enjoy Your Life!");
}
}
}