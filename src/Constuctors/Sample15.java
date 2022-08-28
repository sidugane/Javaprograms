package Constuctors;

public class Sample15
{
	int num3;  //Global variable declaration
	 int num4;
	 
	 Sample15()
	 {
		 num3=10; // Variable initialization
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
		 Sample15 s4=new Sample15();
		 s4.con1();
		 s4.con2();
	}
}
