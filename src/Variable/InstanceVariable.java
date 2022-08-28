package Variable;

public class InstanceVariable 
{
//An instance variable in Java can be declared outside method or constructor but inside a class
//These variables are created when the class object is created and destroyed when the class object is destroyed
//These Variable can not be accessed in static method but can be accessed in non static method within a class
//Instance variables has default values, for int it's "0", String its "null",Boolean its "false"
	
int num; // Instance variable

InstanceVariable(int n)
{
	num=n; //100 n=num (100)
}
public void show()
{
	System.out.println("The Number is :- "+num);
}

public static void main(String[] args) 
{
	InstanceVariable Insta1=new InstanceVariable(100);
	Insta1.show();
}
}

