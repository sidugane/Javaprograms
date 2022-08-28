package Loops;

public class For_Loop10
{
public static void main(String[] args)
{
switch(5)
{
case 2:
	System.out.println("Table of 2");
	for(int a=2;a<=20;a=a+2)
	{
		System.out.println(a);
	}
	break;
case 3:
	System.out.println("Table of 3");
	for(int b=3;b<=30;b=b+3)
	{
		System.out.println(b);
	}
	break;
case 4:
	System.out.println("Table of 4");
	for(int c=4;c<=40;c=c+4)
	{
		System.out.println(c);
	}
	break;
case 5:
	System.out.println("Table of 5");
	for(int d=5;d<=50;d=d+5)
	{
		System.out.println(d);
	}
	break;

	default:
		System.out.println("No Table Found");
	
}
}
}
