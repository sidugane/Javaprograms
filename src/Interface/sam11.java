package Interface;
import java.util.Scanner;
public class sam11 implements sam10
{
int marks;


public void marks()
{
	System.out.println("__EXAMINATION RESULT__");
	System.out.println("");
	System.out.println("Enter Your Marks");
	Scanner sc=new Scanner(System.in);
	marks=sc.nextInt();
	
	if(marks>35 & marks<55)
	{
		System.out.println("Your Result is pass: "+marks);
	}
	else if(marks>=55 & marks<=75)
	{
		System.out.println("Your Result is pass: "+marks);
	}
	else if(marks>75 & marks<=100)
	{
		System.out.println("Your Result is pass: "+marks);
	}
	else
	{
		System.out.println("Your Result is Fail: "+marks);
	}
}

public static void main(String[] args) 
{
	sam11 s11=new sam11();
	s11.marks();
}
}
