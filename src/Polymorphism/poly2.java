package Polymorphism;

public class poly2  extends poly1
{

	public static void main(String[] args) {
		poly2 p2=new poly2();
		p2.listofproperties();
		p2.listofpropertiesfromsun();
		
		myself();
	}
	
	
	
	public static void myself()
	{
		System.out.println("Originally i dont have anything....The Sun");
	}
}
