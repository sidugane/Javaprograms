package Polymorphism;

public class MethodOverLoading1 {

	
	void add(int x,int y)//1
	{
		System.out.println(x+y);
	}
	void add(int x,double y)//2
	{
		System.out.println(x+y);
	}
	void add(double x,int y)//3
	{
		System.out.println(x+y);
	}
	void add(double x,double y)//4
	{
		System.out.println(x+y);
	}
	void add(int x,int y,int z)//5
	{
		System.out.println(x+y+z);
	}
	
	public static void main(String[] args) {
		MethodOverLoading1 mo=new MethodOverLoading1();
		System.out.println("Method Overloading");
		mo.add(25.25, 30.25);
		mo.add(50, 10.5);
		mo.add(20.36, 30);
		mo.add(30.20, 60.20);
		mo.add(25, 36, 60);
	}

}
