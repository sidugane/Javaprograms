package Interface;

public class sam5 implements sam4
{
	public void a1()
	{
		System.out.println("Incomplete method a1() from Interface sam4");
		System.out.println("Method a1() is completed in sam5 class");
	}
	public void b1()
	{
		System.out.println("");
		System.out.println("Incomplete method b1() from Interface sam4");
		System.out.println("Method b1() is completed in sam5 class");
	}
	
	public static void main(String[] args) 
	{
	sam5 s5=new sam5();
	s5.a1();
	s5.b1();
	}
}
