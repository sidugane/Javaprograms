package Casting;

public class sam6 extends sam5
{

	public void aa()
	{
		System.out.println("This is sub class--sam6");
	}
	public void dd()
	{
		System.out.println("This my own property");
	}
	
	public static void main(String[] args)
	{
		sam5 s6=new sam6(); //sam5--super class & sam6--sub class
		s6.aa();
	}
}
