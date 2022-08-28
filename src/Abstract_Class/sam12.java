package Abstract_Class;
//Concrete class
public class sam12 extends sam11
{

	public void v2()
	{
		System.out.println("sam11-v2() definition completed in sam12");
	}
	
	public void v3()
	{
		System.out.println("sam11-v3() definition completed in sam12");	
	}
	
	
	public static void main(String[] args)
	{
	sam12 s12=new sam12();
	s12.v1();
	s12.v2();
	s12.v3();
	}
}
