package Constuctors;

public class Sample22
{
int num;

Sample22(int a)
{
	num=a;
}

public void me()
{
	System.out.println("Printing Table of 2");
	for(int i=2;i<=num;i=i+2)
	{
		System.out.println(i);
	}
}
public static void main(String[] args) 
{
	Sample22 s22=new Sample22(20);
	s22.me();
}
}
