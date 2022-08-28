package Constuctors;

public class Sample2 
{
//Step1. global variable declaration
	int num1;
	int num2;

Sample2() //User defined constructor
{ 
	num1=10; //Step2. Global Variable initialization
	num2=20;
}
public void addition()
{
	System.out.println(num1+num2);	
}
public void Substraction()
{
	System.out.println(num2-num1);	
}
public void multiplication()
{
	System.out.println(num1*num2);	
}
public void Division()
{
	System.out.println(num1/num2);	
}
public static void main(String[] args) 
{
	//Step 3. Variable usage
	Sample2 s2=new Sample2();
	s2.addition();
	s2.Substraction();
	s2.multiplication();
	s2.Division();
}
}
