package Constuctors;

public class Sample8 
{
int a; //Global variable declaration
int b;

Sample8(int aa, int bb)
{
	a=aa; //Assigning local variables into global variables
	b=bb;
}

public void addition()
{
	System.out.println("Addition");
	System.out.println(a+b);
	System.out.println("-------------");
}

public void substraction()
{
	System.out.println("Substraction");
	System.out.println(a-b);
	System.out.println("-------------");
}

public void multiplicaiton()
{
	System.out.println("Multiplication");
	System.out.println(a*b);
	System.out.println("-------------");
}

public void division()
{
	System.out.println("Division");
	System.out.println(a/b);
}

public static void main(String[] args) 
{
	Sample8 s8=new Sample8(10,20); //providing values through the constructors
	s8.addition();
	
	Sample8 s9=new Sample8(10,20);//providing values through the constructors
	s9.substraction();
	
	Sample8 s10=new Sample8(10,20);//providing values through the constructors
	s10.multiplicaiton();
	
	Sample8 s11=new Sample8(10,20);//providing values through the constructors
	s11.division();
}
}
