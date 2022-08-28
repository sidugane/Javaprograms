package Inheritance;
import java.util.Scanner;
public class marks
{
int marks;
//marks(int a)
//{
//marks=a;	
//}

public void marksobtain()
{
	System.out.println("Enter Your Marks");
	Scanner sc=new Scanner(System.in);
	marks=sc.nextInt();
	
	if(marks<35)
	{
		System.out.println("Your Result is Fail "+marks);
	}
	else if(marks>35 & marks<50)
	{
		System.out.println("Your Result is Pass: B+ "+marks);
	}
	else if(marks>50 & marks<=75)
	{
		System.out.println("Your Result is Pass :A+ "+marks);
	}
	else if(marks>75 & marks<=100)
	{
		System.out.println("Your Result is Pass :A++ "+marks);
	}
	else
	{
		System.out.println("Examination not attended...try next time");
	}
}

public static void main(String[] args) 
{
	marks m1=new marks();
	m1.marksobtain();
}
}
