package Inheritance;

public class student3 extends College
{
	void myself3()
	{
		System.out.println("Hi! i am Student 3 ");
		System.out.println("Acquiring MA from College ");
		System.out.println("");
	}

	public static void main(String[] args) 
	{
		student3 s3=new student3();
		s3.myself3();
		s3.MA();
	}
}
