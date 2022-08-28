package Methods;

public class methodtype
{                                  // Practiced on 13/06/2022
public static void myMethod1()    // Static Methods/function and return type is void i.e. null
{
	System.out.println("Inside myMethod1");
}
public static void myMethod2()
{
	System.out.println("Inside myMethod2");
	myMethod1(); //Calling one method to one to another is called as invocation.
}
	public static void main(String[] args)
	{
		myMethod1();
		myMethod2();
		System.out.println("Hello! from main");
	}
}
