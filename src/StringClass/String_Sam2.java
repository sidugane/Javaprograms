package StringClass;

public class String_Sam2 
{
public static void main(String[] args) 
{
	String s1="velocity";
	String s2="ABCD";
	String s3="abcd";
	String s4="My name is Sidharth Dugane";
	
	
	System.out.println("Check the length of velocity");
	System.out.println("The length of velocity is :"+s1.length());
	System.out.println("Converting s1 into upper case letter :"+s1.toUpperCase());
	System.out.println("Converting s1 into lower case letter :"+s1.toLowerCase());
	System.out.println("Check s2 is equals to s3 ignoring case sensitivity: "+s2.equalsIgnoreCase(s3));
	System.out.println("Checking s4 contains the name which i search :"+s4.concat("Sidharth"));
}
}
