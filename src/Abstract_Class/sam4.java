package Abstract_Class;
//Abstract Class
//incomplete class--abstract class--to show the incomplete class need to use abstract keyword
abstract public class sam4 
{
	//complete method
public void m1()
{
	System.out.println("Running Method m1");//method body/definition
}

abstract public void m2(); //incomplete method--only declaration is present here

abstract public void m3();
}

//Combination of complete and incomplete class called as abstract class
// need at lease one complete and one incomplete methods in class
//ratio would be different i.e. 1:100 or 100:1
// 1-complete 100-incomplete or 100 complete 1 incomplete methods
//Can not create object for abstract class. to create a object for that class need to use
//Concrete class.