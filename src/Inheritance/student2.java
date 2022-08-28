package Inheritance;

public class student2 extends College
{

void myself2()
{
	System.out.println("Hi! i am Student 2 ");
	System.out.println("Acquiring MCA from College ");
	System.out.println("");
}

public static void main(String[] args) 
{
	student2 s2=new student2();
	s2.myself2();
	s2.MCA();
}
}
