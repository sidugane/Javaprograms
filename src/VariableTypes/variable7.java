package VariableTypes;

public class variable7 
{
  static int c=1000;
  int d=2000;
public static void main(String[] args) 
{
	a1();
	System.out.println("----------");
	variable7 s2=new variable7();
	s2.a2();
	System.out.println("----------");
System.out.println(c);
System.out.println("------------");
//System.out.println(d);
}

public static void a1()
{
	int a=100;
	System.out.println(a);
	System.out.println(c);
	//System.out.println(d);
}

public void a2()
{
	int b=200;
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
}

}
