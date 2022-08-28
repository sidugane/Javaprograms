package Access_Specifiers;

public class sample19 
{
int x;
int y;
int z;

 sample19()
{
	x=20;
	y=10;
	z=x+y;
}

void m1()
{
	System.out.println("the sum of x+y is :"+z);
}
public static void main(String[] args)
{
	sample19 s9=new sample19();
	s9.m1();
	
	System.out.println("");
	System.out.println(s9.x);
	System.out.println(s9.y);
	System.out.println(s9.z);
}
}
