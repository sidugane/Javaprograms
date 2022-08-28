package Access_Specifiers;

public class sample5 
{
	int b; // default--> access specifiers

	sample5()
	{
		b=20;   // default--> access specifiers
	}

	void m1() // default--> access specifiers
	{
		System.out.println("Running Method m1");
		System.out.println(b);
	}
	public static void main(String[] args)
	{
		System.out.println("Running form diff class");
		sample3_default s3=new sample3_default();
		System.out.println(s3.b);
		System.out.println("");
		s3.m1();
		System.out.println("______BREAK_________");
		
		System.out.println("Running from same class");
		sample5 s5=new sample5();
		s5.m1();
		System.out.println("The Value of Int b="+s5.b);
	}
}
