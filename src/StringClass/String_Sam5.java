package StringClass;

public class String_Sam5 
{
	public static void main(String[] args) 
	
	{
		// Learning String Classes--practiced on 08/06/2022
		String s1="sidharth";
		String s2="dugane";
		String s3="My name is Sidharth";
		String s4="Java Classes";
	
	System.out.println("---CHECKING WITH S1----");
	
	System.out.println(s1.isBlank());
	System.out.println(s1.isEmpty());
	System.out.println(s1.length());
	System.out.println(s1.charAt(0));
	System.out.println(s1.indexOf(2));
	System.out.println(s1.lastIndexOf('d'));
	System.out.println(s1.startsWith("sidharth"));
	System.out.println(s1.endsWith("sidharth"));
	System.out.println(" ");
	System.out.println("---CEHECKING WITH S1 & S2----");
	System.out.println(" ");
	System.out.println(s1==s2);
	System.out.println(s1.toUpperCase());
	System.out.println(s2.toUpperCase());
	System.out.println(s1.equalsIgnoreCase(s2));
	System.out.println(s2.replace("dugane", "Badurkar"));
	
	System.out.println(" ");
	System.out.println("---CEHECKING WITH S3 & S4----");
	System.out.println(" ");
	
	System.out.println("Is s3 contains Sidharth :"+s3.contains("Sidharth"));
	System.out.println("Is s4 contains Java :"+s4.contains("Java"));
	System.out.println("The replacements of words "+s4.replace("Classes", "and Selenium"));
	System.out.println("The length of s4 :"+s4.length());
	System.out.println("The length of s3 :"+s3.length());
	System.out.println("The length of s2 :"+s2.length());
	System.out.println("The length of s1 :"+s1.length());
	
	}


}
