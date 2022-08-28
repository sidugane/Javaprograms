package Constuctors;

public class Sample18
{
	int num3;  //Global variable declaration
	 int num4;
	 
	 Sample18()
	 {
		 num3=110; // Variable initialization
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
		 Sample18 s4=new Sample18();//Calling from same class
		 s4.con1();
		 s4.con2();
		 
		 Sample17 s5=new Sample17(); //Calling from different class
		s5.con1();
		s5.con2();
	}
}
