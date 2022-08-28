package Casting;

public class TestUpCasting extends son
{

	public static void main(String[] args) 
	{
		
		//Create object of sub class with reference of super class
		System.out.println("Super class properties override in sub class");
		father s1=new son();
		s1.car();
		s1.home();
		s1.money();
		
		
		
		System.out.println("");
		son s2=new son();//sub class object creation
		s2.bike();
		s2.car();
		s2.home();
		s2.money();
		
	}
}
