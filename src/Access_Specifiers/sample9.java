package Access_Specifiers;

import java.util.Scanner;

public class sample9
{
	private int a; //Private declaration
	private String b;
    void test()//Private declaration
	{
		System.out.println("Enter your name");
		Scanner sc=new Scanner(System.in);
				b=sc.nextLine();
		System.out.println("Enter you favourite number");
		a=sc.nextInt();
		
		System.out.println("");
		System.out.println("Hello! "+b);
		System.out.println("");
		System.out.println("Your fevourite number is :"+a);
	}

	public static void main(String[] args)
	{
		sample6 s6=new sample6();
		s6.test();
		
		sample7 s7=new sample7();
		s7.test();
		
		sample8 s8=new sample8();
		s8.test();
		
		sample9 s9=new sample9();
		s9.test();
		
	}
}
