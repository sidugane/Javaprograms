package StringClass;

public class String_Sam1 
{
public static void main(String[] args)
{
	// Object creation of String
	//1. Without using new keyword--->Constant Pool Area
	
	
	String s1="abc";
	String s2="abc";
	String s3="abc1";
	
	//2. with new keyword-->Non Constant Pool Area
	
	String s4=new String("abc");
	String s5=new String("abc");
	String s6=new String("abc1");
	
	
	System.out.print("Is s1==s2 ?-->");
	System.out.println(s1==s2);
	
	System.out.print("Is s1==s3?-->");
	System.out.println(s1==s3);
	System.out.print("Is s1==s4 ?-->");
	System.out.println(s1==s4);
	System.out.print("Is s1==s5 ?-->");
	System.out.println(s1==s5);
}
}

