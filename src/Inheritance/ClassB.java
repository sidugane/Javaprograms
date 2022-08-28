package Inheritance;

public class ClassB extends classA
{
public static void main(String[] args)
{
	System.out.println("___________INHERITANCE___________");
	classA b1=new classA();
	b1.m1();
	b1.m2();
	System.out.println("___________BREAK___________");
	ClassB b2=new ClassB();
	b2.m1();
	b2.m2();
}
	
	
}
