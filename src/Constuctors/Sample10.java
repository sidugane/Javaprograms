package Constuctors;

public class Sample10 
{
int a;  //declaring global variables
int b;

Sample10() //User defined constructor--->Without parameter
{
	a=20; //Initialization of global variables
	b=30;
}

public void addition()
{
	System.out.println("Additon");
	System.out.println(a+b);
	System.out.println("---------");
}

public void Substraction()
{
	System.out.println("Substractions");
	System.out.println(a-b);
	System.out.println("---------");
}

public static void main(String[] args)
{

	Sample10 s1=new Sample10();
	s1.addition();
	
	Sample10 s2=new Sample10();
	s2.Substraction();
	
	Sample10 s3=new Sample10();
	s3.addition();
}
}
