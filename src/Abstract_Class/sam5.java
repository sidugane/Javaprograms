package Abstract_Class;
//Concrete Class
public class sam5 extends sam4
{
	//public void m1()
	//{
		//System.out.println("Running Method m1");//method body/definition
	//}

	public void m2()
	{
		System.out.println("Completed in concrete class-m2");
	}

	public void m3()
	{
		System.out.println("Completed in concrete class-m3");
	}

	public static void main(String[] args) 
	{
		sam5 s5=new sam5();
		s5.m1();
		s5.m2();
		s5.m3();
	}
}

//Concrete class--Need to complete each and every method from the abstract class
//else it will remains abstract class.