package Constuctors;

public class Sample17 
{
	int num3;  //Global variable declaration
	 int num4;
	 
	 Sample17()
	 {
		 num3=101; // Variable initialization
		 num4=210;
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
		 Sample17 s4=new Sample17();
		 s4.con1();
		 s4.con2();
	}
}
