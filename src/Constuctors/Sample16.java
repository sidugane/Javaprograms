package Constuctors;

public class Sample16
{
	int num3;  //Global variable declaration
	 int num4;
	 
	 Sample16()
	 {
		 num3=100; // Variable initialization
		 num4=20;
	 }
	 
	 public void con1()
	 {
		 System.out.println("Multiplication of global variables from same class");
		 System.out.println(num3*num4);
	 }
	 public void con2()
	 {
		 System.out.println("Addition of global variables from same class");
		 System.out.println(num3+num4);
	 }
	 
	 
	 public static void main(String[] args) 
	 {
		 Sample16 s4=new Sample16();
		 s4.con1();
		 s4.con2();
	}
}
