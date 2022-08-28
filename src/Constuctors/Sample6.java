package Constuctors;

public class Sample6
{
int num1; //Global variable declaration
int num2;

Sample6(int a, int b)
{
	num1=a;//assigning local variable into global variable
	num2=b;
}

public void addition()
{
	System.out.println(num1+num2);
}
public void substraction()
{
	System.out.println(num1-num2);
}
public static void main(String[] args)
{

	Sample6 s6=new Sample6(10,20);//values assigned to the local variables
	s6.addition();
	s6.substraction();
}
}
