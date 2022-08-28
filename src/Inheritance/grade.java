package Inheritance;
import java.util.Scanner;
public class grade extends stuents
{
int marks;
	public void grades()
	{
		System.out.println(" ");
		System.out.println("______Grade Checking System________");
		System.out.println("Input Your Marks");
		Scanner sc=new Scanner(System.in);	
		marks=sc.nextInt();
		
		if(marks<35)
		{
			System.out.println("Your Grade is : --"+marks);
		}
		
		else if(marks>35 & marks<=50)
		{
			System.out.println("Your Grade is : C "+marks);
		}
		
		else if(marks>50 & marks<=65)
		{
			System.out.println("Your Grade is : B "+marks);
		}
		else if(marks>65 & marks<=75)
		{
			System.out.println("Your Grade is : A "+marks);
		}
		else if(marks>75 & marks<=100)
		{
			System.out.println("Your Grade is : A++ "+marks);
		}
		else
		{
			System.out.println("Your Result/Grade Not Found "+marks);
		}
	}
	public static void main(String[] args) 
	{
	
	grade g=new grade(); //This is Multilevel Inheritance example
	g.studentinfo();
	g.marksobtain();
	g.grades();
	
	
	}
}

//Here Class grade is acquiring properties of stuents--->Super Class
//& stuents class is acquiring properties of marks class--Sub Class-->Super Class
//stuents and marks properties acquiring in grade class-->Sub Class
