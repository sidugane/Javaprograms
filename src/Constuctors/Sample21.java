package Constuctors;

public class Sample21 //Constructor using if statement
{
int num;

Sample21(int a)
{
	num=a;
}

public void report()
{
	if(num>=35)
	{
		if(num>=95 & num<=100)
		{
			System.out.println("Grade : A+ "+num+" %");
		}
		if(num>=70 & num<95)
		{
			System.out.println("Grade : A "+num+" %");
		}
		if(num>=60 & num<70)
		{
			System.out.println("Grade : B "+num+" %");
		}
		if(num>=45 & num<60)
		{
			System.out.println("Grade : C+ "+num+" %");
		}
		if(num>35 & num<45)
		{
			System.out.println("Grade : C "+num+" %");
		}
	}
	else
	{
		System.out.println("Fail : "+num+" %");	
	}
}

public static void main(String[] args) 
{
	Sample21 s21=new Sample21(69);
	s21.report();
}

}
