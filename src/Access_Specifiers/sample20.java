package Access_Specifiers;

public class sample20
{
int a;
int b;
int c;

sample20()
{
	a=500;
	b=700;
	c=a+b;
}

void x1()
{
	System.out.println("Print value c: "+c);
	
}
public static void main(String[] args) 
{
	sample20 s20=new sample20();
	s20.x1();
}
}
