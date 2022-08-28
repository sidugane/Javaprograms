package Inheritance;
import java.util.Scanner;
public class stuents extends marks
{

	public void studentinfo()
	{
		System.out.println("Enter Your Name :");
		
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		System.out.println("Hello! "+s);
		
	}
	
	
	public static void main(String[] args)
	{
		
		stuents si=new stuents();
		si.studentinfo();
		System.out.println("_______CHECK YOUR RESULTS_________");
		marks sf=new marks();
	sf.marksobtain();
		
		
	}
	
	
}

//Acquiring properties from the marks class
//This is single level Inheritance-->Acquiring super class properties into sub class