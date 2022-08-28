package Casting;

public class D implements A
{

	public void car()
	{
		System.out.println("D taken Car from A");
	}
	
	public void money()
	{
		System.out.println("D taken money from A");
	}
	
	public void home()
	{
		System.out.println("D taken Home from A");
	}
	
	public static void main(String[] args) 
	
	{
	System.out.println("Inheritance");
	B a=new B();
	a.car();
	a.home();
	a.money();
	a.x();
	a.money1();

	
	C b=new C();
	b.car();
	b.home();
	b.money();

	D d=new D();
	d.home();
	d.car();
	d.money();
	
	System.out.println("");
	
	System.out.println("Up-Casting");
	System.out.println("B is returning values to A");
	A aa=new B();
	aa.car();
	aa.home();
	aa.money();
	
	System.out.println("");
	System.out.println("D is returning values to A");
	A dd=new D();
	dd.home();
	dd.car();
	dd.money();
	
	System.out.println("");
	System.out.println("C is returning values to A");
A bb=new C();
	bb.car();
	bb.home();
	bb.money();

	
	}
}
