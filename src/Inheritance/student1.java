package Inheritance;



public class student1 extends College
{

	void myself()
	{
		System.out.println(" Hi i am Student 1");
		System.out.println("Acquiring post graduate program--MBA");
	}
	
	public static void main(String[] args)
	{
	
	student1 s1=new student1();
	s1.MBA();
	s1.myself();
	}
}
