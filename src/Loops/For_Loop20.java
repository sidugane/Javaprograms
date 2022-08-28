package Loops;

public class For_Loop20
{
public static void main(String[] args) 
{
	a1();
	System.out.println("******");
	For_Loop20 s1=new For_Loop20();
	s1.a2();
}

public static void a1()
{
	for(int i=10;i>=1;i--)
	{
		System.out.println(i);
	}
}

public void a2()
{
	for(int j=3;j<=30;j=j+3)
	{
		System.out.println(j);
	}
}
}
