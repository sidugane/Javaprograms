package Abstract_Class;
//Concrete Class
public class sam14 extends sam13
{

	public void ab2()
	{
		System.out.println("ab2()-Completed definition in sam14");
		
	}
	
	public void ab3()
	{
		System.out.println("ab3()-Completed definition in sam14");
	}
	
	public static void main(String[] args) 
	{
		sam14 s14=new sam14();
		s14.ab1();
		s14.ab2();
		s14.ab3();
	}
}
