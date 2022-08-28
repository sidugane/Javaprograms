package Access_Specifiers;

public class sample3_default 
{
int b; // default--> access specifiers

sample3_default()
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
	sample3_default s3=new sample3_default();
	System.out.println(s3.b);
	
	s3.m1();
}
}
