package Access_Specifiers;
import java.util.Scanner;
public class sample6 
{
private int a;
private String b;
void test()
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
}
}
