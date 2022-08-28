package Interface;

public class sam17 implements sam16
{
public void sum()
{
	for(int i=2;i<=10;i=i+2)
	{
		System.out.println(i);
	}
		
}

public void odd()
{
	for(int i=1;i<=10;i=i+2)
	{
		System.out.println(i);
	}
}

public static void main(String[] args)
{
	sam17 s17=new sam17();
	System.out.println("Printing Sum numbers");
	s17.sum();
	System.out.println("");
	System.out.println("Printing Odd numbers");
	s17.odd();
}
}
