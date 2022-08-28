package Casting;

public class castingson extends castingfather
{
	public void home()
	{
		System.out.println("This is fathers home: 2BHK + My own home 2BHK");
	}

	public void money()
	{
		System.out.println("This is fathers Money: 5L + My own money 5L");
	}
	
	public void Bike()
	{
		System.out.println("This is my own bike....");
	}
	
	public static void main(String[] args) {
		
// To perform the up casting-->Create object of Sub class with reference of Super Class	
//castingfather--->Super Class
//castingson--->Sub Class
//s1-->object of sub class
		System.out.println("Method Overriding & Up Casting");
		System.out.println("");
		castingfather s1=new castingson();
		s1.home();
		s1.money();
		
	}

	
}
