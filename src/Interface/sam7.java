package Interface;
import java.util.Scanner;
public class sam7 implements sam6
{
	int a;
	String s;
public void x1()
{
	System.out.println("Enter your name :");
	Scanner sc=new Scanner(System.in);
	s=sc.nextLine();
	System.out.println("Enter your fourite number :");
	a=sc.nextInt();
	System.out.println("");
	System.out.println("Hello !"+s+": Your favourite number is: "+a);
	}
	
	

public void x2()
{
	System.out.println("Enter your name ");
	Scanner scr=new Scanner(System.in);
	s=scr.nextLine();
	System.out.println("");
	System.out.println("Enter your fev.no:");
	a=scr.nextInt();
	System.out.println("");
	System.out.println("Hello!"+s+" your favourite number is :"+a);
}


public static void main(String[] args)
{
	sam7 s7=new sam7();
	s7.x1();
	s7.x2();
}
}
