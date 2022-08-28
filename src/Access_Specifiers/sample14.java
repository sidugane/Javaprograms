package Access_Specifiers;
import java.util.Scanner;
public class sample14
{

	private int a;
	private int b;
	
	
	void m1()
	{
		
		System.out.println("Enter Your User Name :");
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		
		System.out.println("Hello ! :"+s);
		System.out.println("");
		System.out.println("________WELCOME______");
		
		
		System.out.println("Enter your favourite number");
		a=sc.nextInt();
		System.out.println("Your favourite number is :"+a);
		
		
	}
	
	
	public static void main(String[] args) 
	{
		sample14 s14=new sample14();
		s14.m1();
	}
}
