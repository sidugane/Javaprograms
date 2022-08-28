package StringClass;

public class String_Sam10
{
public static void main(String[] args)
{
	//Exception Handling and String Class practice set
	//Learning String Classes--practiced on 11/06/2022
	String s1="Sidharth";
	String s2="Dugane";
	String s3="Badurkar";
	String s4="post graduate";
	String s5=null;
	String s6="";
	
	System.out.println(s1.toUpperCase());
	try
	{
		System.out.println(s1.toLowerCase());
		System.out.println(s1.equals(s2));
		System.out.println(s5.equals(s6));
		
	}
	catch(NullPointerException e)
	{
		System.out.println("Null value occurs");
	}
	
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toCharArray());
	
	System.out.println(s4.toUpperCase());
	System.out.println(s1.concat(s2));
	System.out.println(s4.replace("post", "MCA"));
	System.out.println(s4.contains("post"));
	System.out.println(s1.startsWith("Sid"));
	System.out.println(s2.endsWith("Dugane"));
	System.out.println(s1.equals(s5));
}
}
