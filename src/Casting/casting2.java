package Casting;

public class casting2 extends casting1
{

	void a()    //Practiced on 12/06/2022 Sunday
	{
		System.out.println("This is casting 2: having a method");
	}
	public void x()
	{
		System.out.println("Iherited properties of x from casting 1");
	}
	public void y()
	{
		System.out.println("Iherited properties of y from casting 1");
	}
	
	public static void z()
	{
		System.out.println("Iherited properties of z from casting 1");
	}
	public static void main(String[] args) 
	{
		System.out.println("Normal Inheritance operation performed");
		casting2 c=new casting2();
		c.a();
		c.x();
		c.y();
		c.z();
		
		
		System.out.println("");
		System.out.println("This up casting example");
		casting1 a=new casting2();
		a.x();
		a.y();
		a.z();
		
		
	}
}
