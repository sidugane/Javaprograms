package Constuctors;

public class Sample4
{
 int num3;  //Global variable declaration
 int num4;
 
 Sample4()
 {
	 num3=10; // Variable initialization
	 num4=20;
 }
 
 public void con1()
 {
	 System.out.println("Multiplication of global variables from same class");
	 System.out.println(num3*num4);
 }
 
 
 public static void main(String[] args) 
 {
	 Sample4 s4=new Sample4();
	 s4.con1();
}
}
