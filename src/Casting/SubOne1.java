package Casting;

//This is Sub Class-->Performing Up Casting.
public class SubOne1 extends SuperOne1
{

	void supercar()
	{
		System.out.println("This is Up Casting");
		System.out.println("I have taken property from SuperOne1--Its Super Car");
	}
	
	void supermoney()
	{
		System.out.println("");
		System.out.println("This is Up Casting");
		System.out.println("I have taken property from SuperOne1--Its about Money");
	}
	void myown()
	{

		System.out.println("This is my own property");
	}
	
	public static void main(String[] args) 
	{
		SuperOne1 s1=new SubOne1();
		s1.supercar();
		s1.supermoney();
		s1.supermoney();

		
	}
}
