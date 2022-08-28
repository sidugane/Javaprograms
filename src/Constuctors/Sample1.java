package Constuctors;

public class Sample1
{
 public void m1()
 {
	 System.out.println("Running non static method");
 }
 
 public static void main(String[] args)
 {
	 Sample1 s1=new Sample1();
	 s1.m1();
	 //Constructor :- use to copy all member of class into object
	 //Sample1();---> is a constructor
	 
	 //Constructors are 2 types 1) Default Constructor 2)User defined Constructor
	 
}
}
