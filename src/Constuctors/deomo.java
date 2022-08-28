package Constuctors;

public class deomo
{
int a;

deomo()  //Constructor
{
	a=10; //assigining value to global variable/initialization
}

public void  m1()
{
	System.out.println("The value is: "+a); //accessing the global variable
}

public static void main(String[] args)
{
deomo s1=new deomo();// Calling constructor
s1.m1(); //Using object
}
}
