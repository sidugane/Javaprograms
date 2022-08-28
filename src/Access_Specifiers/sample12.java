package Access_Specifiers;
import java.util.Scanner;
public class sample12 
{

	int a;
	int b;
	int sum;
	String s;
	
	sample12()
	{
     a=10;
     b=20;
     sum=a+b;
     s="Sidharth";

	}
	
	public void vm1()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(sum);
		System.out.println(s);
	}
	
	public static void main(String[] args) 
	{
		sample12 s12=new sample12();
		s12.vm1();
	}
	
}
