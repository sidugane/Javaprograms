package Access_Specifiers;

public class PrivateSpecifiers 
{

	private int a; //declaring private variables
	private byte b;
	private float c;
	private char d;
	private String e;
	
	private PrivateSpecifiers() //declaring private constructor
	{
		a=10;//initializing private variables
		b=2;
		c=125.5f;
		d='S';
		e="Sidharth Dugane";
	}
	
	private void testprivate()//declaring private method
	{
		System.out.println("Private Integer a :"+a);
		System.out.println("Private byte b :"+b);
		System.out.println("Private float c :"+c);
		System.out.println("Private char d :"+d);
		System.out.println("Private String e :"+e);
		System.out.println("");
		System.out.println("Running Private Specifiers");
	}
	
	public static void main(String[] args)
	{
		PrivateSpecifiers p1=new PrivateSpecifiers();
		p1.testprivate(); //calling private method
		System.out.println("______***********_________");
		System.out.println("");
		System.out.println(p1.a);//Printing private variables
		System.out.println(p1.b);
		System.out.println(p1.c);
		System.out.println(p1.d);
		System.out.println(p1.e);
	}
}
