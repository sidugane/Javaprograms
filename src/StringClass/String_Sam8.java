package StringClass;
import java.util.InputMismatchException;
import java.util.Scanner;
public class String_Sam8 
{
	//Exception Handling and String Class practice set  
	// Learning String Classes--practiced on 08/06/2022
	public void test()
	{
		System.out.println("Enter your 1 digit");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter your 2 digit");
		int b=sc.nextInt();
		System.out.println("Division of a & b is :"+(a/b));
	}
	
	public static void main(String[] args)
	{
		try
		{
		String_Sam8 s8=new String_Sam8();
		s8.test();
		}
		catch(InputMismatchException a)
		{
			System.out.println("Wrong Input");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Numbers can not divide with 0");
		}
	}
		
}