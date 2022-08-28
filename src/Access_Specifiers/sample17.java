package Access_Specifiers;

public class sample17
{

protected int c;
protected sample17()
	{
		c=30;
	}

protected void m1()
{
	System.out.println(c);
}
public static void main(String[] args) 
{
	sample17 s2=new sample17();
	System.out.println("");
	s2.m1();
}
}
