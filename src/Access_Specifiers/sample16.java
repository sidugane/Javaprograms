package Access_Specifiers;

import java.util.Scanner;

public class sample16 

{

	public int a;
	
	public void cassse()
	{
		
		System.out.println("Enter your case number--> 1 to 6 Only");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		
		switch(a)
		{
		case 1:
			System.out.println("Your are in case 1");
			break;
		case 2:
			System.out.println("Your are in case 2");
			break;	
		case 3:
			System.out.println("Your are in case 3");
			break;
		case 4:
			System.out.println("Your are in case 5");
			break;
		case 5:
			System.out.println("Your are in case 5");
			break;
		case 6:
			System.out.println("Your are in case 6");
			break;
			default:
				System.out.println("Out of range case......");
		}
	}
	
	public static void main(String[] args) 
	{
		sample16 s16=new sample16();
		s16.cassse();
	}
}
