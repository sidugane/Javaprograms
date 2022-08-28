package StringClass;

public class String_Sam9
{
	//Exception Handling and String Class practice set
	//Learning String Classes--practiced on 11/06/2022
	public static void main(String[] args) 
	{
		
		try
		{
		NullExcp();	
		}
		catch(NullPointerException e)
		{
			System.out.println("The value is null");
		}
		try
		{
		String_Sam9 ar=new String_Sam9();
		ar.Arith();
		}
		catch(ArithmeticException e)
		{
			System.out.println("Value can not divide with 0");
		}
		try
		{
		String_Sam9 a=new String_Sam9();
		a.arrays();
		}
		catch(ArrayIndexOutOfBoundsException e)	
		{
			System.out.println("String Out of Index");
		}
		finally
		{
			System.out.println("The Test has been successfull!");
		}
	}
	public static void NullExcp()
	{
		String str=null;
		System.out.println(str.length());
	}
	
	public void Arith()
	{
		int a=50,b=0; 
		int c=a/b;
		
		System.out.println(c);
	}
	
	void arrays()
	{
		
		String [] ar=new String[5];
		ar[9]="Sidharth";
		System.out.println(ar[9]);
		
	}
}	
