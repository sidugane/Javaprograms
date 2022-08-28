package Mock_Practice;
import java.util.Scanner;
public class addition
{
int a;
int b;
int sum=a+b;
public void additions()
{
	System.out.println("Enter Your First Number");
	Scanner sc=new Scanner(System.in);
	a=sc.nextInt();
	
	System.out.println("Enter Your Second Number");
	b=sc.nextInt();
	sum=a+b;
System.out.println("Addition of given two numbers is:"+sum);
}

public static void main(String[] args) 
{
	addition a1=new addition();
	a1.additions();
}
}
