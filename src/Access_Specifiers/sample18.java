package Access_Specifiers;

public class sample18 
{
protected int a=10;
protected void s1()
{
	System.out.println("This is exmaple of protect class & protected data type");
	System.out.println(a);
}

protected void a1()
{
	int a=100;
	int b=200;
	int c=a+b;
	System.out.println("The sum a+b= "+c);
}

public static void main(String[] args) 
{
sample18 s8=new sample18();
s8.s1();
s8.a1();
System.out.println("");
System.out.println(s8.a);

}
}
