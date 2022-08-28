package Access_Specifiers;
import java.util.Scanner;
public class sample11
{

	private int a;
	private int b;
	private String s;
	private int sum;
	
	void m1()
	{
		
		System.out.println("Ente Your Name:");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		System.out.println("Hello !"+s);
		
		System.out.println("Enter Your First Number");
		a=sc.nextInt();
		
		System.out.println("Enter Your Second Number");
		b=sc.nextInt();
		
		//sum=a+b;
		System.out.println(s+" : Your Output is as follows");
		System.out.println("Additon"+": "+(a+b));
		System.out.println("Substraction"+":"+(a-b));
		System.out.println("Mulitiplication"+":"+(a*b));
		System.out.println("Division"+":"+(a/b));
		
	}
	
	public static void main(String[] args)
	{
		sample11 s11=new sample11();
		s11.m1();
	}
	
}
