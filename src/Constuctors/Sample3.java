package Constuctors;

public class Sample3
{
	
	int num1;
	int num2;
	
	Sample3() //User defined constructor
	{ 
		num1=100; //Step2. Global Variable initialization
		num2=200;
	}
	
public static void main(String[] args) 
{
	Sample3 s3=new Sample3();
	s3.add();
	System.out.println("----");
	
	s3.sub();
}

public void add()
{
	System.out.println(num1+num2);
}

public void sub()
{
	System.out.println(num1-num2);
}
}
