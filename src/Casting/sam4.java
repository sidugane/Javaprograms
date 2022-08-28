package Casting;

public class sam4 extends sam3
{

	//This is Sub Class
	public void x()
	{
		System.out.println("This is Sid N Dugane--Badurkar");
		System.out.println("This is the example of up casting");
		System.out.println("Here...Method x() Overrides");
	}
	
	public void y()
	{
		System.out.println("Hello ! This is Sidharth Nagorao Dugane");
	}
	public static void main(String[] args) 
	{
		sam3 s3=new sam4();
		s3.x();
	}
}
