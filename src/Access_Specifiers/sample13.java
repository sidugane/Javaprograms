package Access_Specifiers;

public class sample13 
{

	
	int a;
	int b;
	int c;
	
	sample13(int x, int y, int z)
	{
		a=x;
		b=y;
		c=z;
	}
	
	public void m1()
	{
		System.out.println(a);
	}
	
	
	public static void main(String[] args) 
	{
		sample13 s13=new sample13(10,20,30);
		s13.m1();
	}
}

