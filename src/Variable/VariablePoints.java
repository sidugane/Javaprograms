package Variable;

public class VariablePoints 

{
	// 1.Local Variables
	//Local Variable is declare inside the method body/constructor
	//Scope of that variable remains only within the method/construction body
	//Local variable can not be defined with static keyword
	//We can not declare more than one variable with same name.
	
	
	//2. Instance Variables/Global variable
	//An instance variable in Java can be declared outside method or constructor but inside a class
	//These variables are created when the class object is created and destroyed when the class object is destroyed
	//These Variable can not be accessed in static method but can be accessed in non static method within a class
	//Instance variables has default values, for int it's "0", String its "null",Boolean its "false"

	
	//3. Static/Class Variables
	//Class/static variable can be defined using static keyword
	//can be inside a class but outside a method
	//A class/Static variable can be created at the start of the program & destroyed at the end of the program
	//A variable declared with static keyword is called as static variable
	//it is also known as class variable
	//Static variable can be accessed in both static as well as non static method
	//Static variable has a default value for int its "0", for string its "null" and for boolean is "false"

}
