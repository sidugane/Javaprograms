package Constuctors;

public class Sample7 
{
//Constructors using parameters
int a; //declaration of global variables
int b;

Sample7(int aa,int bb)
{
	a=aa;  //Assigning local variables into global variables
	b=bb;
}

public void multiplication()
{
	System.out.println(a*b);
}
public void addition()
{
	System.out.println(a+b);
}

public void division()
{
	System.out.println(a/b);
}
public static void main(String[] args)
{
	
	Sample7 s8=new Sample7(20,25);
	s8.addition();
	
	Sample7 s7=new Sample7(15,20);//Assigning values to the variables
	s7.multiplication();//Calling non static methods
	
	Sample7 s9=new Sample7(40,10);
	s9.division();
}
}
