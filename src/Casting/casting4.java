package Casting;
//Practiced on 12/06/2022 Sunday
public class casting4 extends casting3
{
	public static void a()
	{
		System.out.println("Hello ! 'a' from casting3" );
		System.out.println("Hello ! 'a' from casting4" );
	}

	public static void b()
	{
		System.out.println("Hello ! 'b' from casting3" );
		System.out.println("Hello ! 'b' from casting4" );
	}

	public static void c()
	{
		System.out.println("Hello ! 'c' from casting3" );
		System.out.println("Hello ! 'b' from casting4" );
	}
	
	public static void myown()
	{
		System.out.println("This is my own property....");
	}
	
	
	public static void main(String[] args)
	{
		
		System.out.println("This is Inheritance");
		casting4.a();
		casting4.b();
		casting4.c();
		casting4.myown();
		
		
		System.out.println("");
		System.out.println("This is upcasting");
		casting3.a();
		casting3.b();
		casting3.c();
		
		
	}
}
