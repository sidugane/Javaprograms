package Inheritance;

public class Son extends Father
{
public void me()
{
	System.out.println("Mobile bhi baap ke paise ka hai...Mera kuch bhi nahi");
}


public static void main(String[] args)
{
	Son i1=new Son();
	i1.car();
	i1.Home();
	i1.Property();
	i1.me();
}
}
