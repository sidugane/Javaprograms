package Loops;

public class For_Loop17
{
public static void main(String[] args) 
{
System.out.println("Increment by 1");
For_Loop16 s1=new For_Loop16();
s1.m1();//Calling non static method form diff class
System.out.println("----------------------------");
System.out.println("Decrement by 1");
For_Loop16.m2();//calling static method from diff class
}
}
