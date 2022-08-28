package Interface;
//Implements Class
public class sam3 implements sam1
{

	public void m1()
	{
		System.out.println("Method m1--completed in Implents Class");
	}
	
	public void m2()
	{
		System.out.println("Method m2--completed in Implents Class");
	}
	
	public static void main(String[] args)
	{
	sam3 s3=new sam3();
	s3.m1();
	s3.m2();
	
	System.out.println("The value of a is from interface "+a);
	}
}
