package Loops;

public class For_Loop12
{
public static void main(String[] args)
{
System.out.println("Welcome to the For Loop Practice !");
Loop2(); //calling static method from same class
For_Loop12 a1=new For_Loop12();//Object creation for non static method from same class
a1.Loop1();//calling non static method from same class using object

For_Loop13 s3=new For_Loop13();
s3.s1();
}

 public static void Loop2()//static regular method
 {
	 for(int i=1;i<=10;i++)
	 {
		 for(int j=1;j<=i;j++)
		 {
			 System.out.print("& ");
		 }
		 System.out.println();
	 }
 }
public void Loop1()//Non static regular method
{
	System.out.println("Running For Loop from Non Static Methods-Same Class");
	for(int a=10;a>=1;a--)
	{
		for(int b=1;b<=a;b++)
		{
			System.out.print("$ ");
		}System.out.println("");
		
	}
}
}
