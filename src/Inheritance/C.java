package Inheritance;

public class C extends B
{

	public void c1()
	{
		System.out.println("");
		System.out.println("This is Sub/Child Class---Class C ");
		System.out.println("");
		System.out.println("_____DIAGRAM DISPLAY____");
		System.out.println("");
		//System.out.println("A -->EXTENDS---> B--->EXTENDS---> C");
		System.out.println("A ");
		System.out.println("|Extends");
		System.out.println("B");
		System.out.println("|Extends");
		System.out.println("C ");
		
		System.out.println("");
		System.out.println("**This is example of Multilevel Inheritance**");
	}
	
	public static void main(String[] args)
	{
	C s1=new C();
		s1.a1();
		s1.b1();
		s1.c1();
	}
}
