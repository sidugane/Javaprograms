package StringClass;
import java.util.Scanner;
public class String_Sam3
{
//Exception Handling and String Class practice set
	//Practice Try--> Catch Exception handling---practiced on 08/06/2022
	public static void m1()
	{
		
		int a;
		int b;

		System.out.println("Enter your number");
		Scanner sc=new Scanner(System.in);
	    a=sc.nextInt();
		
		System.out.println("Enter your division number");
        b=sc.nextInt();
		System.out.println("Division of a & b is:"+(a/b));
	}
	
	public static void main(String[] args) 
	{
		try
		{
		m1();
		}
		catch(ArithmeticException e)
		{
			System.out.println("0 can not be divided");
		}
	}	
}
