package Variable;

public class VariableDemo 
{

	static int count=10;  //initial 0---0+1=1,1+1=2
	
	public void incremnt()
	{
		count++;  //2   //10+1+1=12
		count++;  //2+2=4 //12+1+1=14
	}
	
	public static void main(String[] args)
	{
		   
		
		VariableDemo obje1=new VariableDemo();
		VariableDemo obje2=new VariableDemo();
		obje1.incremnt();
		obje2.incremnt();
		
		
	    System.out.println("Object1: count is="+obje1.count);
	    System.out.println("Object2: count is="+obje2.count);	
	}
}

//3. Static/Class Variables
//Class/static variable can be defined using static keyword
//can be inside a class but outside a method
//A class/Static variable can be created at the start of the program & destroyed at the end of the program

//A variable declared with static keyword is called as static variable
//it is also known as class variable
//Static variable can be accessed in both static as well as non static method
//Static variable has a default value for int its "0", for string its "null" and for boolean is "false"

