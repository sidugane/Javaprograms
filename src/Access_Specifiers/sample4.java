package Access_Specifiers;
import java.util.Scanner;
public class sample4 
{

	private int a;
	
	void test()
	{
		System.out.println("Enter your value");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		if(a<30)
		{
			System.out.println("Your entered value is <30 :"+a);
		}
		else if(a>30 & a<=50)
		{
			System.out.println("Your entered vlaue is >30 & <=50 :"+a);
		}
		else if(a>50 & a<=75)
		{
			System.out.println("Your entered vlaue is >50 & <=75 :"+a);
		}
		else if(a>75 & a<=100)
		{
			System.out.println("Your entered vlaue is >75 & <=100 :"+a);
		}
		else
		{
			System.out.println("Your value is >100 :"+a);
		}
	}
	
	public static void main(String[] args) 
	{
		sample4 s4=new sample4();
		s4.test();
		System.out.println("Private Variable Contains Value :"+s4.a);
	}
}
