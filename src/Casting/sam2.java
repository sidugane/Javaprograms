package Casting;
//This is Sub Class
public class sam2 extends sam1
{

	public void A()
	{
		System.out.println("A---America");
	}
	
	public void B()
	{
		System.out.println("B---Bhutan");
	}
	public void C()
	{
		System.out.println("C---Chicago");
	}
	
	public void D()
	{
		System.out.println("D---Denmark");
	}
	
	public static void main(String[] args)
	{
		sam1 s1=new sam2();
		s1.A();
		s1.B();
		s1.C();
	}
}
//Assigning sub class property into superclass is called up casting
//Before performing up casting first we need to perform inheritance operation
//After performing inheritance,the property which are present inside super class
//are only eligible for up casting operation.
//The new property which were declared inside sub class are not eligible for up casting operation
