package VariableTypes;

public class sample4
{
int d=30; //non static global variable
public static void main(String[] args) 
{
//Non-static global variable call from same class
sample4 s4=new sample4(); //1.Create Object of diff class
System.out.println(s4.d+" Here d=30 is non sttic global variable"); //2.Variable call-->ObjectName.variablename
System.out.println("-------------------------");

//Non static global variable call from diff class
sample5 s6=new sample5(); //1.create ibhect of diff class
System.out.println(s6.e+" Here e=40 is non static global variable from diff class"); //2.variable call-->diffclassObjectname.variablename

System.out.println("Calling static method m3 from same class");
m3();
}


public static void m3()
{
	sample4 s5=new sample4();
	System.out.println(s5.d);
}
public void m4()
{
	System.out.println(d);
}
}
