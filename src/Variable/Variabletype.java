package Variable;

public class Variabletype 
{
//1. Local Variables
	
	//Local Variable is declare inside the method body/constructor
	//Scope of that variable remains only within the method/construction body
	//Local variable can not be defined with static keyword
	//We can not declare more than one variable with same name.
	
//Example :	
	//Declaration of non static Method
	
	public void v1()
	{
		// Local variable declaration
		int a=100;  //Here a is a local variable 100 is assigned value
		
		// Printing Local variable value
		System.out.println("The Local Variable value is: "+a);
	}
	
	public static void main(String[] args)
	{
	// Object creation of non static method v1	
	// Formula :  Classname Objectname=new Classname();
		
		Variabletype v11=new Variabletype();
		
		v11.v1();  // Calling Object--Objectname.Methodname();
	}
	
	
}




