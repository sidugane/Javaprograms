package Interface;
import java.util.Scanner;
public class sam9 implements sam8
{
	int marks;
	int age;
public void marks()
{
	System.out.println("Enter Your Marks");
	Scanner sc=new Scanner(System.in);
	marks=sc.nextInt();
	
	if(marks>35)
	{
		System.out.println("Your Result is Pass "+marks+" %");
	}
	else
	{
		System.out.println("Please attend re-exam :"+marks+" %");
	}
}

public void age()
{
	System.out.println("Enter your Age :");
	Scanner scr=new Scanner(System.in);
	age=scr.nextInt();
	
	switch(age)
	{
	case 10:	System.out.println("You are 18+");
	break;
		
	case 20: System.out.println("Your are 20+");
	break;
	
	}
 //
	{
	System.out.println("Enjoy the life");
	}
}

public static void main(String[] args) 
{
	sam9 s9=new sam9();
	s9.marks();
	s9.age();
}
}
