package Constuctors;

public class Sample23 
{
int a; //Global Variable declaration
int b;
int c;
int d;

Sample23(int a1, int b1, int c1,int d1) //Constructor
{
	a=a1; //Assigning local variables into global variables
	b=b1;
	c=c1;
	d=d1;
}

public void MultiTable()
{
	for(int i=1;i<=10;i++)
	{
		System.out.println(i*a+"--"+i*b+"--"+i*c+"--"+i*d);
	}
}

public static void main(String[] args)
{
	Sample23 s23=new Sample23(2,3,4,5);
	s23.MultiTable();
	
	System.out.println("----------------------");
	Sample23 s24=new Sample23(6,7,8,9);
	s24.MultiTable();
	
	System.out.println("----------------------");
	Sample23 s25=new Sample23(10,11,12,13);
	s25.MultiTable();
}
}
