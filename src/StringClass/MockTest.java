package StringClass;
import java.util.*;
public class MockTest 
{
public static void main(String[] args) 
{
	try
	{
		MockTest m1=new MockTest();
		m1.ArithemeticExp();
	}
	
	catch(ArithmeticException e)
	{
		System.out.println("Then number can not be / by 0");
	}
	
	catch(InputMismatchException a)
	{
		System.out.println("Wrong Input");
	}
}


public void ArithemeticExp()
{
	int a=10;int b=0;
	
	System.out.println("The division of a/b :"+(a/b));
}


}
