package Loops;

public class For_Loop8
{
//Write a program to print tables form 2 to 10 using for loop
	
	public static void main(String[] args)
	{
	System.out.println("printing table of 2");
	
     table2(); //printing single table of 2

	System.out.println("printing tables 1 to 10");
	for(int i=1;i<=10;i++)	
		System.out.println(i+"|"+i*2+"|"+i*3+"|"+i*4+"|"+i*6+"|"+i*7+"|"+i*8+"|"+i*9+"|"+i*10);
	}
	
	public static void table2()
	{
		for(int j=2;j<=20;j=j+2)
		{
			System.out.println(j);
		}
	}
}
